package com.portfolio.cral.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Carlos
 */
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
    private String img;

    //Constructor
    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String profesion, String descripcion, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.img = img;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public CharSequence getNombreP() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
