package ru.chat.client;

import java.io.PrintWriter;
import java.net.Socket;

public class MessageSender {

    private final Socket socket;

    public MessageSender(Socket socket) {
        this.socket = socket;
    }

    public void send(String message) {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), false);
            out.write(message + "\r");
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
