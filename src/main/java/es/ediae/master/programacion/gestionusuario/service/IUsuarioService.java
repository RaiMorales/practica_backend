package es.ediae.master.programacion.gestionusuario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.ediae.master.programacion.gestionusuario.entity.UsuarioEntity;

@Service
public interface IUsuarioService {

    public List <UsuarioModel> obtenerUsuarios ();
    public UsuarioModel obtenerUsuarioPorId (Integer idUsuario);
    public UsuarioModel crearUsuario (UsuarioEntity usuario);
    public UsuarioModel actualizarUsuarioPorId (Integer idUsuario, UsuarioModel usuarioModel);
    public void eliminarUsuarioPorId (Integer idUsuario);

}
