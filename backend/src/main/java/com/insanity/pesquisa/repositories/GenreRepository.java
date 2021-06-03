package com.insanity.pesquisa.repositories;

import com.insanity.pesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
