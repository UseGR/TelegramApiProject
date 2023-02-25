package ru.galeev.service.impl;

import lombok.Data;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import ru.galeev.controller.UpdateProcessor;
import ru.galeev.service.AnswerConsumer;

import static ru.galeev.model.RabbitQueue.ANSWER_MESSAGE;

@Service
@Data
public class AnswerConsumerImpl implements AnswerConsumer {
    private final UpdateProcessor updateProcessor;


    @Override
    @RabbitListener(queues = ANSWER_MESSAGE)
    public void consume(SendMessage sendMessage) {
        updateProcessor.setView(sendMessage);
    }
}
