package ru.galeev.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.galeev.entity.AppDocument;
import ru.galeev.entity.AppPhoto;

public interface FileService {
    AppDocument processDoc(Message telegramMessage);
    AppPhoto processPhoto(Message telegramMessage);
}
