package ru.galeev.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface AnswerProducer {
    void consume(SendMessage sendMessage);
}
