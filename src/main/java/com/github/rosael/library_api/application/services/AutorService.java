package com.github.rosael.library_api.application.services;

import com.github.rosael.library_api.data.entities.Autor;
import com.github.rosael.library_api.data.repositories.AutorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AutorService {
    private AutorRepository autorRepository;

    public List<Autor> getAll() {
        return autorRepository.findAll();
    }
}
