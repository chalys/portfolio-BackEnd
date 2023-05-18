package com.portfolio.cral.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ideducacion;

    @NotNull
    @Size(min = 1, max = 90, message = "La longitud del nombre de la institucion no es valida")
    private String nombreE;
    
    @NotNull
    private LocalDate fecha_inicio;

    private LocalDate fecha_fin;

    @Size(min = 0, max = 200, message = "La longitud de la descripcion no es valida")
    private String descripcion;

    @Size(min = 0, max = 260, message = "La longitud del link de logo no es valida")
    private String logo_institucion_url;

    //___________________________Constructores___________________________
    public Educacion() {
    }

    public Educacion(String nombreE, LocalDate fecha_inicio, LocalDate fecha_fin, String descripcion, String logo_institucion_url) {
        this.nombreE = nombreE;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.logo_institucion_url = logo_institucion_url;
    }

    //________________________Setters && Getters________________________
    public int getIdeducacion() {
        return ideducacion;
    }

    public void setIdeducacion(int ideducacion) {
        this.ideducacion = ideducacion;
    }

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

    public String getLogo_institucion_url() {
        return logo_institucion_url;
    }

    public void setLogo_institucion_url(String logo_institucion_url) {
        this.logo_institucion_url = logo_institucion_url;
    }

}
