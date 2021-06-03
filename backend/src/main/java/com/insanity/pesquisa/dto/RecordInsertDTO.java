package com.insanity.pesquisa.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RecordInsertDTO implements Serializable {

    private String name;
    private Integer age;
    private Long gameId;

}
