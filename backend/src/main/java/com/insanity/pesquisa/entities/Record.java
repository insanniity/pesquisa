package com.insanity.pesquisa.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_record")
public class Record implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long age;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;


}
