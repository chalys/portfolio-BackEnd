package com.portfolio.cral.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idexperiencia;
    @NotNull
    @Size(min = 1, max = 90, message = "La longitud del nombre de la experiencia laboral no es valida")
    private String nombreE;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    @Size(min = 0, max = 200, message = "La longitud de la descripcion no es valida")
    private String descripcion;

    //___________________________Constructores___________________________
    public Experiencia() {

    }

    public Experiencia(String nombreE, LocalDate fecha_inicio, LocalDate fecha_fin, String descripcion) {
        this.nombreE = nombreE;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }

    //________________________Setters && Getters________________________
    public int getIdexperiencia() {
        return idexperiencia;
    }

    public void setIdexperiencia(int idexperiencia) {
        this.idexperiencia = idexperiencia;
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

}
