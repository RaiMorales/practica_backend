package es.ediae.master.programacion.gestionusuario.service;

import es.ediae.master.programacion.gestionusuario.entity.DireccionEntity;
import es.ediae.master.programacion.gestionusuario.entity.UsuarioEntity;

public class DireccionModel {

    private Integer id;
    private String nombreCalle;
    private Integer numeroCalle;
    private UsuarioEntity usuario;
    private Boolean direccionPrincipal;

    public DireccionModel (Integer id, String nombreCalle, Integer numeroCalle, UsuarioEntity usuario, Boolean direccionPrincipal) {
        
        this.id = id;
        this.nombreCalle = nombreCalle;
        this.numeroCalle = numeroCalle;
        this.usuario = usuario;
        this.direccionPrincipal = direccionPrincipal;
    }

    public Integer getId() {
        
        return this.id;
    }

    public void setId(Integer id) {
        
        this.id = id;
    }

    public String getNombreCalle() {
        
        return this.nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        
        this.nombreCalle = nombreCalle;
    }

    public Integer getNumeroCalle() {
        
        return this.numeroCalle;
    }

    public void setNumeroCalle(Integer numeroCalle) {
        
        this.numeroCalle = numeroCalle;
    }

    public UsuarioEntity getUsuario() {
        
        return this.usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        
        this.usuario = usuario;
    }

    public Boolean isDireccionPrincipal() {
        
        return this.direccionPrincipal;
    }

    public void setDireccionPrincipal(Boolean direccionPrincipal) {
        
        this.direccionPrincipal = direccionPrincipal;
    }

    public static DireccionModel fromEntity (DireccionEntity direccionEntity) {

        return new DireccionModel (
            direccionEntity.getId(),
            direccionEntity.getNombreCalle(),
            direccionEntity.getNumeroCalle(),
            direccionEntity.getUsuario(),
            direccionEntity.isDireccionPrincipal()
        );
    }
}
