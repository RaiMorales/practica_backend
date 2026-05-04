package es.ediae.master.programacion.gestionusuario.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ediae.master.programacion.gestionusuario.entity.DireccionEntity;
import es.ediae.master.programacion.gestionusuario.repository.DireccionRepository;
import es.ediae.master.programacion.gestionusuario.service.DireccionModel;
import es.ediae.master.programacion.gestionusuario.service.IDireccionService;

@Service
public class DireccionService implements IDireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public List<DireccionModel> obtenerTodasLasDireccionesDeUnUsuario(Integer usuarioId) {
        
        return direccionRepository.buscarPorUsuarioId(usuarioId).stream()
                .map(DireccionModel::fromEntity)
                .toList();
    }

    @Override
    public DireccionModel obtenerDireccionPorId(Integer idDireccion) {

        return direccionRepository.findById(idDireccion)
            .map(DireccionModel::fromEntity)
            .orElse(null);
    }

    @Override
    public DireccionModel crearNuevaDireccion(DireccionEntity direccion) {
        
        direccionRepository.save(direccion);
        return DireccionModel.fromEntity(direccion);
    }

    @Override
    public DireccionModel actualizarDireccionExistente(Integer idDireccion, DireccionModel direccion) {
        
        Optional <DireccionEntity> optionalDireccion = direccionRepository.findById(idDireccion);
        if (optionalDireccion.isPresent()) {

            DireccionEntity direccionEntity = optionalDireccion.get();
            direccionEntity.setNombreCalle(direccion.getNombreCalle());
            direccionEntity.setNumeroCalle(direccion.getNumeroCalle());
            direccionEntity.setUsuario(direccion.getUsuario());
            direccionEntity.setDireccionPrincipal(direccion.isDireccionPrincipal());
            return DireccionModel.fromEntity(direccionRepository.save(direccionEntity));
        }
        else {
            return null;
        }
    }

    @Override
    public void eliminarDireccionExistente(Integer idDireccion) {
        
        direccionRepository.deleteById(idDireccion);
    }
    

}
