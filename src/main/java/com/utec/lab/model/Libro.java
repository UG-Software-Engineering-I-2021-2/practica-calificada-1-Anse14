package com.utec.lab.model;

import java.util.Date;

public class Libro {
    private String nombre;
    private Date anho;
    private Autor autor;

    public Libro(String nombre, Date anho, Autor autor) {
        this.nombre = nombre;
        this.anho = anho;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getAnho() {
        return anho;
    }

    public void setAnho(Date anho) {
        this.anho = anho;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
