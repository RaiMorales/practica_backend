package es.ediae.master.programacion.gestionusuario.service.impl;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ediae.master.programacion.gestionusuario.controller.UsuarioPostDTO;
import es.ediae.master.programacion.gestionusuario.entity.UsuarioEntity;
import es.ediae.master.programacion.gestionusuario.repository.UsuarioRepository;
import es.ediae.master.programacion.gestionusuario.service.IUsuarioService;
import es.ediae.master.programacion.gestionusuario.service.UsuarioModel;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public List <UsuarioModel> obtenerUsuarios() {
        
        return usuarioRepository.findAll().stream()
                .map(UsuarioModel::fromEntity)
                .toList();
    }

    @Override
    public UsuarioModel obtenerUsuarioPorId(Integer idUsuario) {
        
        return usuarioRepository.findById(idUsuario)
            .map(UsuarioModel::fromEntity)
            .orElse(null);
    }

    @Override
    public UsuarioModel crearUsuario(UsuarioPostDTO usuarioPostDTO) {
        
        UsuarioEntity usuario = UsuarioPostDTO.toEntity(usuarioPostDTO);
        usuarioRepository.save(usuario);
        return UsuarioModel.fromEntity(usuario);
    }

    @Override
    public UsuarioModel actualizarUsuarioPorId(Integer idUsuario, UsuarioModel usuarioModel) {
        
        Optional <UsuarioEntity> optionalUsuario = usuarioRepository.findById(idUsuario);
        if (optionalUsuario.isPresent()) {

            UsuarioEntity usuarioEntity = optionalUsuario.get();
            usuarioEntity.setNickUsuario(usuarioModel.getNickUsuario());
            usuarioEntity.setContrasena(usuarioModel.getContrasena());
            usuarioEntity.setGenero(usuarioModel.getGenero());
            usuarioEntity.setNombre(usuarioModel.getNombre());
            usuarioEntity.setPrimerApellido(usuarioModel.getPrimerApellido());
            usuarioEntity.setSegundoApellido(usuarioModel.getSegundoApellido());
            usuarioEntity.setFechaNacimiento(usuarioModel.getFechaNacimiento());
            usuarioEntity.setHoraDesayuno(usuarioModel.getHoraDesayuno());
            usuarioEntity.setPuestoTrabajo(usuarioModel.getPuestoTrabajo());
            return UsuarioModel.fromEntity(usuarioRepository.save(usuarioEntity));
        }
        else {
            return null;
        }
    }

    @Override
    public void eliminarUsuarioPorId(Integer idUsuario) {
        
        usuarioRepository.deleteById(idUsuario); 
    }

}
