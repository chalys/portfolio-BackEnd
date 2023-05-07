package com.portfolio.cral.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHardSkills {

    @NotBlank
    private String nombreH;
    @NotBlank
    private int porcentaje;

    //___________________________Constructores___________________________
    public dtoHardSkills() {
    }

    public dtoHardSkills(String nombreH, int porcentaje) {
        this.nombreH = nombreH;
        this.porcentaje = porcentaje;
    }

    //________________________Setters && Getters________________________

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
}
