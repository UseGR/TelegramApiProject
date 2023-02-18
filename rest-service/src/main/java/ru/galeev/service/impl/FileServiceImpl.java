package ru.galeev.service.impl;

import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;
import ru.galeev.dao.AppDocumentDAO;
import ru.galeev.dao.AppPhotoDAO;
import ru.galeev.entity.AppDocument;
import ru.galeev.entity.AppPhoto;
import ru.galeev.entity.BinaryContent;
import ru.galeev.service.FileService;


import java.io.File;
import java.io.IOException;

@Log4j
@Service
@Data
public class FileServiceImpl implements FileService {
    private final AppDocumentDAO appDocumentDAO;
    private final AppPhotoDAO appPhotoDAO;

    @Override
    public AppDocument getDocument(String docId) {
        var id = Long.parseLong(docId);
        return appDocumentDAO.findById(id).orElse(null);
    }

    @Override
    public AppPhoto getPhoto(String photoId) {
        var id = Long.parseLong(photoId);
        return appPhotoDAO.findById(id).orElse(null);
    }

    @Override
    public FileSystemResource getFileSystemResource(BinaryContent binaryContent) {
        try {
            File temp = File.createTempFile("tempFile", ".bin");
            temp.deleteOnExit();
            FileUtils.writeByteArrayToFile(temp, binaryContent.getFileAsArrayOfBytes());
            return new FileSystemResource(temp);
        } catch (IOException e) {
            log.error(e);
            return null;
        }
    }
}
