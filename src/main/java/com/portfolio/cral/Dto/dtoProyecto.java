package com.portfolio.cral.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Carlos
 */
public class dtoProyecto {

    @NotBlank
    private int id;
    @NotBlank
    private String nombreP;
    @NotBlank
    private String fechaP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String linkP;
    @NotBlank
    private String imgP;

    //Constructor
    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String fechaP, String descripcionP, String linkP, String imgP) {
        this.nombreP = nombreP;
        this.fechaP = fechaP;
        this.descripcionP = descripcionP;
        this.linkP = linkP;
        this.imgP = imgP;
    }

    //________________________Setters && Getters________________________
    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getLinkP() {
        return linkP;
    }

    public void setLinkP(String linkP) {
        this.linkP = linkP;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }
}
