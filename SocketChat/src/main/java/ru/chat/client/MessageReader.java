package ru.chat.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class MessageReader extends Thread {

    private final Socket socket;

    public MessageReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            while (true) {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("[Chat]" + in.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
