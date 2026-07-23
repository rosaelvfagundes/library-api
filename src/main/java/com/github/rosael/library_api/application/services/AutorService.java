package com.github.rosael.library_api.application.services;

import com.github.rosael.library_api.data.entities.Autor;
import com.github.rosael.library_api.data.repositories.AutorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AutorService {
    private AutorRepository autorRepository;

    public List<Autor> buscarAutores() {
        return autorRepository.findAll();
    }

    public Autor buscarAutorPorId(UUID id) {
        return autorRepository.findById(id)
            .orElseThrow();
    }

    public Autor salvarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor atualizarAutor(UUID id, Autor dadosAtualizados) {
        Autor autor = autorRepository.findById(id)
            .orElseThrow();

        autor.atualizarDados(dadosAtualizados);

        return autorRepository.save(autor);
    }

    public void deletarAutor(UUID id) {
        autorRepository.deleteById(id);
    }
}
