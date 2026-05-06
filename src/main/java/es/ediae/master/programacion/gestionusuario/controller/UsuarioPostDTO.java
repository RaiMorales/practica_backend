package es.ediae.master.programacion.gestionusuario.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

import es.ediae.master.programacion.gestionusuario.entity.GeneroEntity;
import es.ediae.master.programacion.gestionusuario.entity.PuestoDeTrabajoEntity;
import es.ediae.master.programacion.gestionusuario.entity.UsuarioEntity;
import es.ediae.master.programacion.gestionusuario.service.UsuarioModel;

public class UsuarioPostDTO {

    // Atributos

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

    public UsuarioPostDTO (String nickUsuario, String contrasena, LocalDateTime fechaHoraCreacion,
            GeneroEntity genero, String nombre, String primerApellido, String segundoApellido,
            Date fechaNacimiento, LocalTime horaDesayuno, PuestoDeTrabajoEntity puestoTrabajo) {

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

    // Método que convierte un UsuarioPostDTO a un UsuarioEntity

    public static UsuarioEntity toEntity (UsuarioPostDTO usuarioPostDTO) {

        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setNickUsuario(usuarioPostDTO.getNickUsuario());
        usuario.setContrasena(usuarioPostDTO.getContrasena());
        usuario.setFechaHoraCreacion(usuarioPostDTO.getFechaHoraCreacion());
        usuario.setGenero(usuarioPostDTO.getGenero());
        usuario.setNombre(usuarioPostDTO.getNombre());
        usuario.setPrimerApellido(usuarioPostDTO.getPrimerApellido());
        usuario.setSegundoApellido(usuarioPostDTO.getSegundoApellido());
        usuario.setFechaNacimiento(usuarioPostDTO.getFechaNacimiento());
        usuario.setHoraDesayuno(usuarioPostDTO.getHoraDesayuno());
        usuario.setPuestoTrabajo(usuarioPostDTO.getPuestoTrabajo());
        return usuario;
    }
}
