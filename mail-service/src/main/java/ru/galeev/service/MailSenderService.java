package ru.galeev.service;

import ru.galeev.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}
