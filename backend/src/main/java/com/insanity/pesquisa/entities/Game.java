package com.insanity.pesquisa.entities;

import com.insanity.pesquisa.entities.enums.Platform;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Game implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;
    private String title;
    private Platform platform;

    private Genre genre;

    private List<Record> records = new ArrayList<>();


}
