package com.portfolio.cral.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpersona;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;

    @Size(min = 0, max = 50, message = "La longitud de la profesion no es valida")
    private String profesion;

    @NotNull
    @Size(min = 0, max = 200, message = "La longitud de la descripcion no es valida")
    private String descripcion;

    @NotNull
    @Size(min = 1, max = 45, message = "La longitud del pais no es valida")
    private String pais;

    @NotNull
    private LocalDate fecha_nacimiento;

    @Size(min = 0, max = 12, message = "La longitud del telefono no es valida")
    private String telefono;

    @Size(min = 0, max = 260, message = "La longitud del link de perfil no es valida")
    private String foto_perfil_url;

    //___________________________Constructores___________________________
    public Persona() {
    }

    public Persona(String nombre, String apellido, String profesion, String descripcion, String pais, LocalDate fecha_nacimiento, String telefono, String foto_perfil_url) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.pais = pais;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.foto_perfil_url = foto_perfil_url;
    }

    //________________________Setters && Getters________________________
    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto_perfil_url() {
        return foto_perfil_url;
    }

    public void setFoto_perfil_url(String foto_perfil_url) {
        this.foto_perfil_url = foto_perfil_url;
    }
}
