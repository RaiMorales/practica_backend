package es.ediae.master.programacion.gestionusuario.controller;

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
}
