package com.portfolio.cral.Dto;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;

public class dtoProyecto {

    @NotBlank
    private int idproyecto;
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcion;
    @NotBlank
    private LocalDate fecha_inicio;
    @NotBlank
    private LocalDate fecha_fin;
    @NotBlank
    private String url_proyecto;
    @NotBlank
    private String foto_proyecto_url;

    //___________________________Constructores___________________________
    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcion, LocalDate fecha_inicio, LocalDate fecha_fin, String url_proyecto, String foto_proyecto_url) {
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
