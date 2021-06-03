package com.insanity.pesquisa.services;

import com.insanity.pesquisa.dto.RecordDTO;
import com.insanity.pesquisa.dto.RecordInsertDTO;
import com.insanity.pesquisa.entities.Game;
import com.insanity.pesquisa.entities.Record;
import com.insanity.pesquisa.repositories.GameRepository;
import com.insanity.pesquisa.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto){
        Record entity = new Record();
        entity.setName(dto.getName());
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());
        Game game = gameRepository.getById(dto.getGameId());
        entity.setGame(game);
        Record newEntity = repository.save(entity);
        return new RecordDTO(newEntity);
    }

    @Transactional(readOnly = true)
    public Page<RecordDTO> findByMoment(Instant minDate, Instant maxDate, PageRequest pageRequest) {
        return repository.findByMoment(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
    }
}
