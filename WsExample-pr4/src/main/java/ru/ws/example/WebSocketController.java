package ru.ws.example;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {

    @MessageMapping("/webs")
    @SendTo("/topic/messages")
    public Message send(Message message) {
        return message;
    }


}
