package com.github.rosael.library_api.presentation.dtos.request;

import com.github.rosael.library_api.data.entities.Autor;

import java.time.LocalDate;

public record AutorRequestDTO(
    String nome,
    LocalDate dataNascimento,
    String nacionalidade
) {
    public Autor toEntity() {
        Autor autor = new Autor();

        autor.setNome(nome);
        autor.setDataNascimento(dataNascimento);
        autor.setNacionalidade(nacionalidade);

        return autor;
    }
}
