package com.utec.lab.model;

import java.util.*;
import java.util.logging.Logger;

public class BioAlert {
    private static Logger logger = Logger.getLogger("BioAlert: ");
    private static BioAlert instance;

    private List<Libro> libros;
    private List<Copia> copias;
    private List<Prestamo> prestamos;

    public static BioAlert getInstance() {
        if(instance == null) {
            instance = new BioAlert();
        }
        return instance;
    }

    private BioAlert() {
        this.libros = new ArrayList<>();
        this.copias = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void pedirCopiaPrestada(Estudiante e, String titulo) throws NoSuchElementException {
        if(Boolean.FALSE.equals(e.puedePedirPrestado())) {
            throw new UnsupportedOperationException("Estudiante no puede pedir prestado");
        }

        var exists = false;
        Copia c = null;
        for(var copia : copias) {
            if(copia.getOriginal().getNombre().equals(titulo)) {
                c = copia;
                exists = true;
                break;
            }
        }
        if(!exists) {
            throw new NoSuchElementException("Libro no encontrado");
        }

        Prestamo p = new Prestamo(c, new Date());

        e.addPrestamo(p);
        prestamos.add(p);

        c.setEstado(Estatus.PRESTADA);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        e.setUltimaMulta(cal.getTime());

        var msg = String.format("El estudiante %s ha pedido prestado una copia de el libro %s", e.getNombre(), titulo);
        logger.info(msg);
    }

    public void registrarCopia(Libro l, Copia c) {
        var exists = false;
        for(var libro : libros) {
            if(libro.getNombre().equals(l.getNombre())) {
                exists = true;
                break;
            }
        }

        if(!exists) {
            libros.add(l);
        }

        copias.add(c);
    }
}
