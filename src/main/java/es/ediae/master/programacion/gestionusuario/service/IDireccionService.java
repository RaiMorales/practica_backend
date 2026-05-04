package es.ediae.master.programacion.gestionusuario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.ediae.master.programacion.gestionusuario.entity.DireccionEntity;

@Service
public interface IDireccionService {

    public List <DireccionModel> obtenerTodasLasDireccionesDeUnUsuario (Integer usuarioId);
    public DireccionModel obtenerDireccionPorId (Integer idDireccion);
    public DireccionModel crearNuevaDireccion (DireccionEntity direccion);
    public DireccionModel actualizarDireccionExistente (Integer idDireccion, DireccionModel direccion);
    public void eliminarDireccionExistente (Integer idDireccion);
}
