package com.portfolio.cral.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class HardSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idskill;

    @NotNull
    @Size(min = 1, max = 20, message = "La longitud de la skill no es valida")
    private String nombreH;

    @NotNull
    private int porcentaje;

    //___________________________Constructores___________________________
    public HardSkills() {
    }

    public HardSkills(String nombreH, int porcentaje) {
        this.nombreH = nombreH;
        this.porcentaje = porcentaje;
    }

    //________________________Setters && Getters________________________
    public int getIdskill() {
        return idskill;
    }

    public void setIdskill(int idskill) {
        this.idskill = idskill;
    }

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
