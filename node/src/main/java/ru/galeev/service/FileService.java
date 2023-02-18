package ru.galeev.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.galeev.entity.AppDocument;
import ru.galeev.entity.AppPhoto;
import ru.galeev.service.enums.LinkType;

public interface FileService {
    AppDocument processDoc(Message telegramMessage);
    AppPhoto processPhoto(Message telegramMessage);
    String generateLink(Long docId, LinkType linkType);
}
