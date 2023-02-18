package ru.galeev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.galeev.entity.RawData;

public interface RawDataDAO extends JpaRepository<RawData, Long> {
}
