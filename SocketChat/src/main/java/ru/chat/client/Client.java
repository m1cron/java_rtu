package ru.chat.client;

import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 25555);

            MessageSender messageSender = new MessageSender(socket);
            MessageReader messageReader = new MessageReader(socket);
            messageReader.start();

            Scanner scanner = new Scanner(System.in);
            while (true) {
                messageSender.send(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
