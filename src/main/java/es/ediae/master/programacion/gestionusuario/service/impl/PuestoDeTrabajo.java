package es.ediae.master.programacion.gestionusuario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ediae.master.programacion.gestionusuario.repository.PuestoDeTrabajoRepository;
import es.ediae.master.programacion.gestionusuario.service.IPuestoDeTrabajo;
import es.ediae.master.programacion.gestionusuario.service.PuestoDeTrabajoModel;

@Service
public class PuestoDeTrabajo implements IPuestoDeTrabajo{

    @Autowired
    private PuestoDeTrabajoRepository puestoDeTrabajoRepository;
    
    @Override
    public List <PuestoDeTrabajoModel> obtenerPuestosDeTrabajo() {

        return puestoDeTrabajoRepository.findAll().stream()
                .map(PuestoDeTrabajoModel::fromEntity)
                .toList();
    }

}
