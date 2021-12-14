package ru.ws.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ws.example.entity.MessageEntity;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
}
