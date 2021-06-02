package com.insanity.pesquisa.entities;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Record implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private Long age;
    private Instant moment;

    private Game game;


}
