package com.utec.lab.model;

import java.util.Date;

public class Prestamo {
    private Copia copia;
    private Date fechaDelPrestamo;
    private Boolean activo;

    public Prestamo(Copia copia, Date fechaDelPrestamo) {
        this.copia = copia;
        this.fechaDelPrestamo = fechaDelPrestamo;
        this.activo = true;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }

    public Date getFechaDelPrestamo() {
        return fechaDelPrestamo;
    }

    public void setFechaDelPrestamo(Date fechaDelPrestamo) {
        this.fechaDelPrestamo = fechaDelPrestamo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
