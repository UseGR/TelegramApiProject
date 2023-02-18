package ru.galeev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.galeev.entity.AppPhoto;

public interface AppPhotoDAO extends JpaRepository<AppPhoto, Long> {
}
