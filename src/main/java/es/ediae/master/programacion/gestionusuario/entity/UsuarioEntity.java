package es.ediae.master.programacion.gestionusuario.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table (name = "usuario")
public class UsuarioEntity {
    
    // Atributos

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private String nick_usuario;

    @Column (nullable = false)
    private String contrasena;

    @Column (nullable = false)
    private LocalDateTime fecha_hora_creacion;

    @ManyToOne (optional = false) // Usamos el optional = false para indicar que esta relaciónn no puede ser nula
    private GeneroEntity genero;

    @Column (nullable = false)
    private String nombre;

    @Column (nullable = false)
    private String primer_apellido;

    @Column (nullable = true)
    private String segundo_apellido;

    @Column (nullable = false)
    @Temporal (TemporalType.DATE)
    private Date fecha_nacimiento;

    @Column (nullable = true)
    @Temporal (TemporalType.TIME)
    private Date hora_desayuno;

    @ManyToOne // No es necesario el @Column porque no es un campo simple, sino una relación con otra entidad. Además tiene un parámetro optional que por defecto es true, lo que significa que puede ser nulo. Si se quisiera que no fuera nulo, habría que poner optional = false.
    private PuestoDeTrabajoEntity puesto_trabajo;

    @OneToMany (mappedBy = "usuario")
    private List <DireccionEntity> direcciones;

    // Getter y Setters

    public Integer getId () {

        return this.id;
    }

    public String getNickUsuario () {

        return this.nick_usuario;
    }

    public String getContrasena () {

        return this.contrasena;
    }

    public LocalDateTime getFechaHoraCreacion () {

        return this.fecha_hora_creacion;
    }

    public GeneroEntity getGenero () {

        return this.genero;
    }

    public String getNombre () {

        return this.nombre;
    }

    public String getPrimerApellido () {

        return this.primer_apellido;
    }

    public String getSegundoApellido () {

        return this.segundo_apellido;
    }

    public Date getFechaNacimiento () {

        return this.fecha_nacimiento;
    }

    public Date getHoraDesayuno () {

        return this.hora_desayuno;
    }

    public PuestoDeTrabajoEntity getPuestoTrabajo () {

        return this.puesto_trabajo;
    }

    public void setId (Integer id) {

        this.id = id;
    }

    public void setNickUsuario (String nickUsuario) {

        this.nick_usuario = nickUsuario;
    }

    public void setContrasena (String contrasena) {

        this.contrasena = contrasena;
    }

    public void setFechaHoraCreacion (LocalDateTime fechaHoraCreacion) {

        this.fecha_hora_creacion = fechaHoraCreacion;
    }

    public void setGenero (GeneroEntity genero) {

        this.genero = genero;
    }

    public void setNombre (String nombre) {

        this.nombre = nombre;
    }

    public void setPrimerApellido (String primerApellido) {

        this.primer_apellido = primerApellido;
    }

    public void setSegundoApellido (String segundoApellido) {

        this.segundo_apellido = segundoApellido;
    }

    public void setFechaNacimiento (Date fechaNacimiento) {

        this.fecha_nacimiento = fechaNacimiento;
    }

    public void setHoraDesayuno (Date horaDesayuno) {

        this.hora_desayuno = horaDesayuno;
    }

    public void setPuestoTrabajo (PuestoDeTrabajoEntity puestoTrabajo) {

        this.puesto_trabajo = puestoTrabajo;
    }
}
