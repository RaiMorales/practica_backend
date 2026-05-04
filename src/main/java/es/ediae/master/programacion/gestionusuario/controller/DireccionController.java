package es.ediae.master.programacion.gestionusuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ediae.master.programacion.gestionusuario.service.DireccionModel;
import es.ediae.master.programacion.gestionusuario.service.impl.DireccionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    @GetMapping("/direccion/{idDireccion}")
    public DireccionDTO obtenerDireccion(@PathVariable Integer idDireccion) {

        return DireccionDTO.fromModel(direccionService.obtenerDireccionPorId(idDireccion));
    }

    //TODO: IMPLEMENTAR EL MÉTODO DE CREAR UNA DIRECCION PARA UN USUARIO (NO LO HAGO PORQUE NECESITO EL SERVICIO DE USUARIO PARA OBTENER EL USUARIO POR SU ID Y ASI INYECTORLO EN LA DIRECCION)
    
    @PutMapping("/direccion/{idDireccion}") //PROBAR ESTE MÉTODO CON POSTMAN CUANDO TENGA MAS USUARIOS
    public DireccionDTO actualizarDireccion(@PathVariable Integer idDireccion, @RequestBody DireccionDTO direccionDTO){

        return DireccionDTO.fromModel(direccionService.actualizarDireccionExistente(idDireccion, DireccionModel.fromDTO(direccionDTO)));
    }

    

}
