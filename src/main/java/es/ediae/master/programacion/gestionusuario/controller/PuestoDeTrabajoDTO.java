package es.ediae.master.programacion.gestionusuario.controller;

import es.ediae.master.programacion.gestionusuario.service.PuestoDeTrabajoModel;

public class PuestoDeTrabajoDTO {

    // Atributos
    private Integer id;
    private String nombre;

    // Constructor 

    public PuestoDeTrabajoDTO (Integer id, String nombre) {

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

    // Método para convertir de Model a DTO

    public static PuestoDeTrabajoDTO fromModel (PuestoDeTrabajoModel puestoDeTrabajoModel) {

        return new PuestoDeTrabajoDTO(puestoDeTrabajoModel.getId(), puestoDeTrabajoModel.getNombre());
    }
}
