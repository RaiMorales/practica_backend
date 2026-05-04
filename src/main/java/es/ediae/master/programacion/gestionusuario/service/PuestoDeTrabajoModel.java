package es.ediae.master.programacion.gestionusuario.service;

import es.ediae.master.programacion.gestionusuario.entity.PuestoDeTrabajoEntity;

public class PuestoDeTrabajoModel {

     // Atributos
    private Integer id;
    private String nombre;

    // Constructor 

    public PuestoDeTrabajoModel (Integer id, String nombre) {

        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters

    public Integer getId () {

        return this.id;
    }

    public String getNombre () {

        return this.nombre;
    }

    public void setId (Integer id) {

        this.id = id;
    }

    public void setNombre (String nombre) {

        this.nombre = nombre;
    }

    // Método para convertir de Entity a Model

    public static PuestoDeTrabajoModel fromEntity (PuestoDeTrabajoEntity puestoDeTrabajoEntity) {

        return new PuestoDeTrabajoModel(puestoDeTrabajoEntity.getId(), puestoDeTrabajoEntity.getNombre());
    }

}
