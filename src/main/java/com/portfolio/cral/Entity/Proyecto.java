package com.portfolio.cral.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproyecto;

    @NotNull
    @Size(min = 1, max = 45, message = "La longitud del nombre no es valida")
    private String nombreP;

    @Size(min = 0, max = 200, message = "La longitud de la descripcion no es valida")
    private String descripcion;
    
    @NotNull
    private LocalDate fecha_inicio;

    private LocalDate fecha_fin;

    private String url_proyecto;

    private String foto_proyecto_url;

    //___________________________Constructores___________________________
    public Proyecto() {
    }

    public Proyecto(String nombreP, String descripcion, LocalDate fecha_inicio, LocalDate fecha_fin, String url_proyecto, String foto_proyecto_url) {
        this.nombreP = nombreP;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.url_proyecto = url_proyecto;
        this.foto_proyecto_url = foto_proyecto_url;
    }

    //________________________Setters && Getters________________________
    public int getIdproyecto() {
        return idproyecto;
    }

    public void setIdproyecto(int idproyecto) {
        this.idproyecto = idproyecto;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getUrl_proyecto() {
        return url_proyecto;
    }

    public void setUrl_proyecto(String url_proyecto) {
        this.url_proyecto = url_proyecto;
    }

    public String getFoto_proyecto_url() {
        return foto_proyecto_url;
    }

    public void setFoto_proyecto_url(String foto_proyecto_url) {
        this.foto_proyecto_url = foto_proyecto_url;
    }

}
