package com.utec.lab.model;

public class Copia {
    private String id;
    private Estatus estado;
    private Libro original;

    public Copia(String id, Libro original) {
        this.id = id;
        this.estado = Estatus.DISPONIBLE;
        this.original = original;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Estatus getEstado() {
        return estado;
    }

    public void setEstado(Estatus estado) {
        this.estado = estado;
    }

    public Libro getOriginal() {
        return original;
    }

    public void setOriginal(Libro original) {
        this.original = original;
    }
}
