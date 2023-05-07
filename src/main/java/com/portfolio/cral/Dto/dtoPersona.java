package com.portfolio.cral.Dto;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;

public class dtoPersona {

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotBlank
    private String profesion;

    @NotBlank
    private String descripcion;

    @NotBlank
    private String pais;

    @NotBlank
    private LocalDate fecha_nacimiento;

    @NotBlank
    private String telefono;

    @NotBlank
    private String foto_perfil_url;

    //___________________________Constructores___________________________
    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String profesion, String descripcion, String pais, LocalDate fecha_nacimiento, String telefono, String foto_perfil_url) {
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
