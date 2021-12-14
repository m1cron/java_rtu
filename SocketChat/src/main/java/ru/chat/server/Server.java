package ru.chat.server;

import ru.chat.ChatMetaHolder;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) {
        ChatMetaHolder metaHolder = ChatMetaHolder.getInstance();
        int port = 25555;
        try {
            ServerSocket socket = new ServerSocket(port);
            ExecutorService executor = Executors.newFixedThreadPool(11);
            executor.execute(new MessageSender());
            System.out.println("[Server]Server has been started on " + port + " port!");

            while (true) {
                Socket user = socket.accept();
                metaHolder.addUser(user);
                executor.execute(new SocketHandler(user));
                System.out.println("[Server]New user has been connected! Now " + metaHolder.getUsers().size() + " users connected!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
