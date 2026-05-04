package es.ediae.master.programacion.gestionusuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ediae.master.programacion.gestionusuario.service.impl.DireccionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/v1")
public class DireccionController {

    @Autowired
    private DireccionService direccionService;

    @GetMapping("/usuario/{usuarioId}/direcciones")
    public List <DireccionDTO> obtenerDireccines(@PathVariable Integer usuarioId) {
        
        return direccionService.obtenerTodasLasDireccionesDeUnUsuario(usuarioId).stream()
                .map(DireccionDTO::fromModel)
                .toList();
    }
    

}
