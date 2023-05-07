package com.portfolio.cral.Dto;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;

public class dtoExperiencia {

    @NotBlank
    private String nombreE;
    @NotBlank
    private LocalDate fecha_inicio;
    @NotBlank
    private LocalDate fecha_fin;
    @NotBlank
    private String descripcion;

    //___________________________Constructores___________________________
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, LocalDate fecha_inicio, LocalDate fecha_fin, String descripcion) {
        this.nombreE = nombreE;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }

    //________________________Setters && Getters________________________
    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
