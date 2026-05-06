package es.ediae.master.programacion.gestionusuario.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

import es.ediae.master.programacion.gestionusuario.controller.UsuarioPostDTO;
import es.ediae.master.programacion.gestionusuario.entity.GeneroEntity;
import es.ediae.master.programacion.gestionusuario.entity.PuestoDeTrabajoEntity;
import es.ediae.master.programacion.gestionusuario.entity.UsuarioEntity;

public class UsuarioModel {

    // Atributos

    private Integer id;
    private String nickUsuario;
    private String contrasena;
    private LocalDateTime fechaHoraCreacion;
    private GeneroEntity genero;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private LocalTime horaDesayuno;
    private PuestoDeTrabajoEntity puestoTrabajo;

    // Constructor

    public UsuarioModel (Integer id, String nickUsuario, String contrasena, LocalDateTime fechaHoraCreacion,
            GeneroEntity genero, String nombre, String primerApellido, String segundoApellido,
            Date fechaNacimiento, LocalTime horaDesayuno, PuestoDeTrabajoEntity puestoTrabajo) {

        this.id = id;
        this.nickUsuario = nickUsuario;
        this.contrasena = contrasena;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.genero = genero;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.horaDesayuno = horaDesayuno;
        this.puestoTrabajo = puestoTrabajo;
    }

    // Getter y Setters

    public Integer getId () {

        return this.id;
    }

    public String getNickUsuario () {

        return this.nickUsuario;
    }

    public String getContrasena () {

        return this.contrasena;
    }

    public LocalDateTime getFechaHoraCreacion () {

        return this.fechaHoraCreacion;
    }

    public GeneroEntity getGenero () {

        return this.genero;
    }

    public String getNombre () {

        return this.nombre;
    }

    public String getPrimerApellido () {

        return this.primerApellido;
    }

    public String getSegundoApellido () {

        return this.segundoApellido;
    }

    public Date getFechaNacimiento () {

        return this.fechaNacimiento;
    }

    public LocalTime getHoraDesayuno () {

        return this.horaDesayuno;
    }

    public PuestoDeTrabajoEntity getPuestoTrabajo () {

        return this.puestoTrabajo;
    }

    public void setId (Integer id) {

        this.id = id;
    }

    public void setNickUsuario (String nickUsuario) {

        this.nickUsuario = nickUsuario;
    }

    public void setContrasena (String contrasena) {

        this.contrasena = contrasena;
    }

    public void setFechaHoraCreacion (LocalDateTime fechaHoraCreacion) {

        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public void setGenero (GeneroEntity genero) {

        this.genero = genero;
    }

    public void setNombre (String nombre) {

        this.nombre = nombre;
    }

    public void setPrimerApellido (String primerApellido) {

        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido (String segundoApellido) {

        this.segundoApellido = segundoApellido;
    }

    public void setFechaNacimiento (Date fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;
    }

    public void setHoraDesayuno (LocalTime horaDesayuno) {

        this.horaDesayuno = horaDesayuno;
    }

    public void setPuestoTrabajo (PuestoDeTrabajoEntity puestoTrabajo) {

        this.puestoTrabajo = puestoTrabajo;
    }

    // Método para convertir de Entity a Model

    public static UsuarioModel fromEntity (UsuarioEntity usuarioEntity) {

        return new UsuarioModel(usuarioEntity.getId(), usuarioEntity.getNickUsuario(),
                usuarioEntity.getContrasena(), usuarioEntity.getFechaHoraCreacion(),
                usuarioEntity.getGenero(), usuarioEntity.getNombre(), usuarioEntity.getPrimerApellido(),
                usuarioEntity.getSegundoApellido(), usuarioEntity.getFechaNacimiento(),
                usuarioEntity.getHoraDesayuno(), usuarioEntity.getPuestoTrabajo());
    }
}
