package ru.galeev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.galeev.entity.BinaryContent;

public interface BinaryContentDAO extends JpaRepository<BinaryContent, Long> {

}
