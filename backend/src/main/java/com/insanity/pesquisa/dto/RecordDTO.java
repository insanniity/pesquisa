package com.insanity.pesquisa.dto;

import com.insanity.pesquisa.entities.Record;
import com.insanity.pesquisa.entities.enums.Platform;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RecordDTO implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;
    private Instant moment;
    private String name;
    private Integer age;
    private String gameTitle;
    private Platform gamePlatform;
    private String genreName;

    public RecordDTO(Record entity){
        id = entity.getId();
        moment = entity.getMoment();
        name = entity.getName();
        age = entity.getAge();
        gameTitle= entity.getGame().getTitle();
        gamePlatform = entity.getGame().getPlatform();
        genreName = entity.getGame().getGenre().getName();
    }


    public RecordDTO(RecordDTO newEntity) {
    }
}
