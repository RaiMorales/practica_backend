package es.ediae.master.programacion.gestionusuario.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table (name = "genero")
public class GeneroEntity {
    
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private String nombre;

    @OneToMany (mappedBy = "genero")
    private List <UsuarioEntity> usuarios;


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
}
