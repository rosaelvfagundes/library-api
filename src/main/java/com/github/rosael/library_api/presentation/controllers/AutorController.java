package com.github.rosael.library_api.presentation.controllers;

import com.github.rosael.library_api.application.services.AutorService;
import com.github.rosael.library_api.data.entities.Autor;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/autores")
@AllArgsConstructor
public class AutorController {
    private AutorService autorService;

    @GetMapping()
    public ResponseEntity<List<Autor>> getAll(){
        return ResponseEntity.status(HttpStatus.ACCEPTED)
            .body(
                autorService.getAll()
            );
    }
}
