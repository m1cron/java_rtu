package ru.chat.server;

import ru.chat.ChatMetaHolder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketHandler implements Runnable {

    private final Socket socket;
    private final ChatMetaHolder metaHolder;

    public SocketHandler(Socket socket) {
        this.metaHolder = ChatMetaHolder.getInstance();
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                if (in.ready()) {
                    String message = metaHolder.addMessage(in.readLine());
                    System.out.println("[Server]Get new message: " + message);
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
