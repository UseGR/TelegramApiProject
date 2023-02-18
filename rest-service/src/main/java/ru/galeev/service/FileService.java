package ru.galeev.service;

import org.springframework.core.io.FileSystemResource;
import ru.galeev.entity.AppDocument;
import ru.galeev.entity.AppPhoto;
import ru.galeev.entity.BinaryContent;

public interface FileService {
    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);
    FileSystemResource getFileSystemResource(BinaryContent binaryContent);
}
