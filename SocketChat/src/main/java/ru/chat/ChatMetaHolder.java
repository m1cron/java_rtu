package ru.chat;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatMetaHolder {

    private static final ChatMetaHolder INSTANCE = new ChatMetaHolder();
    private final List<Socket> users;
    private final List<String> messages;

    public ChatMetaHolder() {
        this.users = new ArrayList<>();
        this.messages = Collections.synchronizedList(new ArrayList<>());
    }

    public void addUser(Socket user) {
        users.add(user);
    }

    public String addMessage(String message) {
        messages.add(message);
        return message;
    }

    public void clearMessages() {
        messages.clear();
    }

    public List<Socket> getUsers() {
        return users;
    }

    public List<String> getMessages() {
        return messages;
    }

    public static ChatMetaHolder getInstance() {
        return INSTANCE;
    }

}
