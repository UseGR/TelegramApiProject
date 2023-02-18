package ru.galeev.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.galeev.entity.AppDocument;

public interface FileService {
    AppDocument processDoc(Message externalMessage);
}
