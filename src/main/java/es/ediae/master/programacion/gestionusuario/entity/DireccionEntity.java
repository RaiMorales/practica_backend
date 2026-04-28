package es.ediae.master.programacion.gestionusuario.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "direccion")
public class DireccionEntity {
    
    // Atributos

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private String nombre_calle;

    @Column (nullable = true)
    private Integer numero_calle;

    @ManyToOne (optional = false) // Usamos el optional = false para indicar que esta relaciónn no puede ser nula
    private UsuarioEntity usuario;

    @Column (nullable = false)
    private boolean direccion_principal;

    // Getter y Setters

    public Integer getId () {

        return this.id;
    }

    public String getNombreCalle () {

        return this.nombre_calle;
    }

    public Integer getNumeroCalle () {

        return this.numero_calle;
    }

    public UsuarioEntity getUsuario () {

        return this.usuario;
    }

    public boolean isDireccionPrincipal () {

        return this.direccion_principal;
    }

    public void setId (Integer id) {

        this.id = id;
    }

    public void setNombreCalle (String nombreCalle) {

        this.nombre_calle = nombreCalle;
    }

    public void setNumeroCalle (Integer numeroCalle) {

        this.numero_calle = numeroCalle;
    }

    public void setUsuario (UsuarioEntity usuario) {

        this.usuario = usuario;
    }

    public void setDireccionPrincipal (boolean direccionPrincipal) {

        this.direccion_principal = direccionPrincipal;
    }
}
