package es.ediae.master.programacion.gestionusuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ediae.master.programacion.gestionusuario.service.impl.PuestoDeTrabajoService;

@RestController
@RequestMapping("/api/v1")
public class PuestoDeTrabajoController {

    @Autowired
    private PuestoDeTrabajoService puestoDeTrabajoService;

    @GetMapping("/puesto-de-trabajo")
    public List <PuestoDeTrabajoDTO> obtenerPuestosDeTrabajo() {

        return puestoDeTrabajoService.obtenerPuestosDeTrabajo().stream()
                .map(PuestoDeTrabajoDTO::fromModel)
                .toList();
    }

}
