package com.github.rosael.library_api.presentation.controllers;

import com.github.rosael.library_api.application.services.AutorService;
import com.github.rosael.library_api.data.entities.Autor;
import com.github.rosael.library_api.presentation.dtos.request.AutorRequestDTO;
import com.github.rosael.library_api.presentation.dtos.response.AutorResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/autores")
@AllArgsConstructor
public class AutorController {
    private AutorService autorService;

    @GetMapping()
    public ResponseEntity<List<AutorResponseDTO>> buscarAutores(){
        return ResponseEntity.status(HttpStatus.OK)
            .body(
                autorService.buscarAutores()
                    .stream()
                    .map(AutorResponseDTO::fromEntity)
                    .toList()
            );
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorResponseDTO> buscarAutorPorId(@PathVariable("id") UUID id) {
        return ResponseEntity.status(HttpStatus.OK)
            .body(AutorResponseDTO.fromEntity(autorService.buscarAutorPorId(id)));
    }

    @PostMapping
    public ResponseEntity<Void> salvarAutor(@RequestBody AutorRequestDTO dto) {
        Autor autor = dto.toEntity();
        autorService.salvarAutor(autor);

        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("{id}")
            .buildAndExpand(autor.getId())
            .toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarAutor(@PathVariable("id") UUID id, @RequestBody AutorRequestDTO dto) {
        autorService.atualizarAutor(id, dto.toEntity());
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAutor(@PathVariable("id") UUID id) {
        autorService.deletarAutor(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
