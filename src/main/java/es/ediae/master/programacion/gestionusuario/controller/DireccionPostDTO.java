package es.ediae.master.programacion.gestionusuario.controller;

import es.ediae.master.programacion.gestionusuario.entity.DireccionEntity;
import es.ediae.master.programacion.gestionusuario.entity.UsuarioEntity;

public class DireccionPostDTO {

    // Atributos

    private String nombreCalle;
    private Integer numeroCalle;
    private UsuarioEntity usuario;
    private boolean direccionPrincipal;

    // Constructor

    public DireccionPostDTO (String nombreCalle, Integer numeroCalle, UsuarioEntity usuario, boolean direccionPrincipal) {

        this.nombreCalle = nombreCalle;
        this.numeroCalle = numeroCalle;
        this.usuario = usuario;
        this.direccionPrincipal = direccionPrincipal;
    }

    // Getter y Setters

    public String getNombreCalle () {

        return this.nombreCalle;
    }

    public Integer getNumeroCalle () {

        return this.numeroCalle;
    }

    public UsuarioEntity getUsuario () {

        return this.usuario;
    }

    public boolean isDireccionPrincipal () {

        return this.direccionPrincipal;
    }

    public void setNombreCalle (String nombreCalle) {

        this.nombreCalle = nombreCalle;
    }

    public void setNumeroCalle (Integer numeroCalle) {

        this.numeroCalle = numeroCalle;
    }

    public void setUsuario (UsuarioEntity usuario) {

        this.usuario = usuario;
    }

    public void setDireccionPrincipal (boolean direccionPrincipal) {

        this.direccionPrincipal = direccionPrincipal;
    }

    // Método para convertir un DireccionPostDTO a un DireccionEntity

    public static DireccionEntity toEntity (DireccionPostDTO direccionPostDTO) {

        DireccionEntity direccion = new DireccionEntity();
        direccion.setNombreCalle(direccionPostDTO.getNombreCalle());
        direccion.setNumeroCalle(direccionPostDTO.getNumeroCalle());
        direccion.setUsuario(direccionPostDTO.getUsuario());
        direccion.setDireccionPrincipal(direccionPostDTO.isDireccionPrincipal());
        return direccion;
    }
}
