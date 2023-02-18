package ru.galeev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.galeev.entity.AppDocument;

public interface AppDocumentDAO extends JpaRepository<AppDocument, Long> {
}
