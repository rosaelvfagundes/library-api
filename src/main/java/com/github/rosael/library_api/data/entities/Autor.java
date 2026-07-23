package com.github.rosael.library_api.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_autores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(length = 50, nullable = false)
    private String nacionalidade;

    public void atualizarDados(Autor dados) {
        if (dados.getNome() != null) setNome(dados.getNome());
        if (dados.getDataNascimento() != null) setDataNascimento(dados.getDataNascimento());
        if (dados.getNacionalidade() != null) setNacionalidade(dados.getNacionalidade());
    }
}
