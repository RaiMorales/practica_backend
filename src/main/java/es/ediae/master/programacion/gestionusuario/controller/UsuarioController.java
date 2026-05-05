package es.ediae.master.programacion.gestionusuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ediae.master.programacion.gestionusuario.service.impl.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public List <UsuarioDTO>  obtenerUsuarios() {
        return usuarioService.obtenerUsuarios().stream()
                .map(UsuarioDTO::fromModel)
                .toList();
    }

    @GetMapping("/usuario/{idUsuario}")
    public UsuarioDTO obtenerUsuario(@PathVariable Integer idUsuario) {
        return UsuarioDTO.fromModel(usuarioService.obtenerUsuarioPorId(idUsuario));
    }
    
    @PostMapping("/usuario")
    public UsuarioDTO crearUsuario(@RequestBody UsuarioPostDTO usuarioPostDTO) {

        return UsuarioDTO.fromModel(usuarioService.crearUsuario(usuarioPostDTO));
    }
    

}
