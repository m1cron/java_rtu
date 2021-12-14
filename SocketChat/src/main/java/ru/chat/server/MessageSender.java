package ru.chat.server;

import ru.chat.ChatMetaHolder;

import java.io.PrintWriter;
import java.net.Socket;

public class MessageSender implements Runnable {

    private final ChatMetaHolder metaHolder;

    public MessageSender() {
        this.metaHolder = ChatMetaHolder.getInstance();
    }

    @Override
    public void run() {
        while (true) {
            for (String message : metaHolder.getMessages()) {
                for (Socket user : metaHolder.getUsers()) {
                    try {
                        PrintWriter out = new PrintWriter(user.getOutputStream(), false);
                        out.write(message + "\n");
                        out.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            metaHolder.clearMessages();

            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
