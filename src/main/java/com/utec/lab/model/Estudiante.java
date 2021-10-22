package com.utec.lab.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Estudiante {
    private String id;
    private String nombre;

    private Integer numeroDeElementosPrestados;
    private Integer numeroDeMultas;
    private Date ultimaMulta;
    private List<Prestamo> prestamos;

    public Estudiante(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
        this.ultimaMulta = new Date(0);
        this.numeroDeMultas = 0;
        this.numeroDeElementosPrestados = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroDeMultas() {
        return numeroDeMultas;
    }

    public void setNumeroDeMultas(Integer numeroDeMultas) {
        this.numeroDeMultas = numeroDeMultas;
    }

    public Date getUltimaMulta() {
        return ultimaMulta;
    }

    public void setUltimaMulta(Date ultimaMulta) {
        this.ultimaMulta = ultimaMulta;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
        this.numeroDeElementosPrestados++;
    }

    public Boolean puedePedirPrestado() {
        if(this.numeroDeElementosPrestados >= 3) {
            return false;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(this.ultimaMulta);
        c.add(Calendar.DAY_OF_YEAR, 2*this.numeroDeMultas);
        Date d = c.getTime();
        Date actual = new Date();
        return !d.after(actual);
    }
}
