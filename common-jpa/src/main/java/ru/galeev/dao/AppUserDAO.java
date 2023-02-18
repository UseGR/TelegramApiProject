package ru.galeev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.galeev.entity.AppUser;

public interface AppUserDAO extends JpaRepository<AppUser, Long> {
    AppUser findAppUserByTelegramUserId(Long id);
}
