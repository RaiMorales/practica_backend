package es.ediae.master.programacion.gestionusuario.controller;

import es.ediae.master.programacion.gestionusuario.service.GeneroModel;

public class GeneroDTO {

    // Atributos
    
    private Integer id;
    private String nombre;

    // Constructor

    public GeneroDTO (Integer id, String nombre) {

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

    public static GeneroDTO fromModel (GeneroModel generoModel) {

        return new GeneroDTO(generoModel.getId(), generoModel.getNombre());
    }
}
