package com.insanity.pesquisa.dto;

import com.insanity.pesquisa.entities.Game;
import com.insanity.pesquisa.entities.enums.Platform;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GameDTO implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;
    private String title;
    private Platform platform;

    public GameDTO (Game entity){
        id = entity.getId();
        title = entity.getTitle();
        platform = entity.getPlatform();
    }


}
