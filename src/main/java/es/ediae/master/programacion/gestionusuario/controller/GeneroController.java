package es.ediae.master.programacion.gestionusuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ediae.master.programacion.gestionusuario.service.impl.GeneroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @GetMapping("/genero")
    public List <GeneroDTO> obtenerGneros() {
        return generoService.obtenerTodosLosGeneros().stream()
                .map(GeneroDTO::fromModel)
                .toList();
    }
    
}
