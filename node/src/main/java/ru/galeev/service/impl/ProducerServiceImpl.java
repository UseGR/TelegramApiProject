package ru.galeev.service.impl;

import lombok.Data;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import ru.galeev.service.ProducerService;

import static ru.galeev.model.RabbitQueue.ANSWER_MESSAGE;

@Service
@Data
public class ProducerServiceImpl implements ProducerService {
    private final RabbitTemplate rabbitTemplate;
    @Override
    public void produceAnswer(SendMessage sendMessage) {
        rabbitTemplate.convertAndSend(ANSWER_MESSAGE, sendMessage);
    }
}
