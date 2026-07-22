package com.github.rosael.library_api.data.repositories;

import com.github.rosael.library_api.data.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
