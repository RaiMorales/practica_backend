package es.ediae.master.programacion.gestionusuario.controller;

import es.ediae.master.programacion.gestionusuario.entity.UsuarioEntity;
import es.ediae.master.programacion.gestionusuario.service.DireccionModel;

public class DireccionDTO {

    // Atributos
    
    private Integer id;
    private String nombreCalle;
    private Integer numeroCalle;
    private UsuarioEntity usuario;
    private boolean direccionPrincipal;

    // Constructor

    public DireccionDTO (Integer id, String nombreCalle, Integer numeroCalle, UsuarioEntity usuario, boolean direccionPrincipal) {

        this.id = id;
        this.nombreCalle = nombreCalle;
        this.numeroCalle = numeroCalle;
        this.usuario = usuario;
        this.direccionPrincipal = direccionPrincipal;
    }

    // Getter y Setters

    public Integer getId () {

        return this.id;
    }

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

    public void setId (Integer id) {

        this.id = id;
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

    // Método para convertir un DireccionModel a un DireccionDTO

    public static DireccionDTO fromModel (DireccionModel direccionModel) {
        
        return new DireccionDTO(
            direccionModel.getId(),
            direccionModel.getNombreCalle(),
            direccionModel.getNumeroCalle(),
            direccionModel.getUsuario(),
            direccionModel.isDireccionPrincipal()
        );
    }
}