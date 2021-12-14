package ru.ws.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import ru.ws.example.entity.MessageEntity;
import ru.ws.example.model.Message;
import ru.ws.example.repo.MessageRepository;
import ru.ws.example.util.MessageSender;

@Service
public class MessageService {

    @Autowired
    private MessageSender messageSender;
    @Autowired
    private MessageRepository messageRepository;

    @Async
    public void saveAndSendMessage(Message message) {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        messageRepository.save(new MessageEntity(message));
        messageSender.sendMessage(message);
    }

}
