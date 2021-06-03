package com.insanity.pesquisa.repositories;

import com.insanity.pesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
