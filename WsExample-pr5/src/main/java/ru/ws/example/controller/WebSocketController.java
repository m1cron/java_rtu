package ru.ws.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;
import ru.ws.example.model.Message;
import ru.ws.example.service.MessageService;

@RestController
public class WebSocketController {

    @Autowired
    private MessageService messageService;

    @MessageMapping("/webs")
    @SendTo("/topic/messages")
    public Message send(Message message) {
        messageService.saveAndSendMessage(message);
        return new Message("Process...");
    }


}
