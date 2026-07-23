package com.github.rosael.library_api.presentation.dtos.response;

import com.github.rosael.library_api.data.entities.Autor;

import java.time.LocalDate;

public record AutorResponseDTO(
    String nome,
    LocalDate dataNascimento,
    String nacionalidade
) {
    public static AutorResponseDTO fromEntity(Autor autor) {
        return new AutorResponseDTO(
          autor.getNome(),
          autor.getDataNascimento(),
          autor.getNacionalidade()
        );
    }
}
