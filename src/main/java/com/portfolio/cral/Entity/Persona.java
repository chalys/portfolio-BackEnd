package com.portfolio.cral.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Carlos
 */

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
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
    
    @Size(min = 0, max = 260, message = "La longitud del link de perfil no es valida")
    private String img;

    //___________________________Constructores___________________________
    public Persona() {
    }

    public Persona(String nombre, String apellido, String profesion, String descripcion, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.img = img;
    }

    //________________________Setters && Getters________________________
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}