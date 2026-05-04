package es.ediae.master.programacion.gestionusuario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ediae.master.programacion.gestionusuario.repository.GeneroRepository;
import es.ediae.master.programacion.gestionusuario.service.GeneroModel;
import es.ediae.master.programacion.gestionusuario.service.IGeneroService;

@Service
public class GeneroService implements IGeneroService {

    @Autowired
    private GeneroRepository generoRepository;
    
    @Override
    public List<GeneroModel> obtenerTodosLosGeneros() {
        
        return generoRepository.findAll().stream()
                .map(GeneroModel::fromEntity)
                .toList();
    }

}
