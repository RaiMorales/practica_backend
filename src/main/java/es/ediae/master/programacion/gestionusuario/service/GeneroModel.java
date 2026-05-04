package es.ediae.master.programacion.gestionusuario.service;

import es.ediae.master.programacion.gestionusuario.entity.GeneroEntity;

public class GeneroModel {

    // Atributos
    
    private Integer id;
    private String nombre;

    // Constructor

    public GeneroModel (Integer id, String nombre) {

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
    
    public static GeneroModel fromEntity (GeneroEntity generoEntity) {

        return new GeneroModel(generoEntity.getId(), generoEntity.getNombre());
    }
}
