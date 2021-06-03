package com.insanity.pesquisa.controllers;

import com.insanity.pesquisa.dto.RecordDTO;
import com.insanity.pesquisa.dto.RecordInsertDTO;
import com.insanity.pesquisa.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/records")
public class RecordController {

    @Autowired
    private RecordService service;

    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
        RecordDTO newDto = service.insert(dto);
        return ResponseEntity.ok().body(newDto);
    }

}
