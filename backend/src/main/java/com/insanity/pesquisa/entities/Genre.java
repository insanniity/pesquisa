package com.insanity.pesquisa.entities;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Genre implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;
    private String name;

    private List<Game> games = new ArrayList<>();

}
