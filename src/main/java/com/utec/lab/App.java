package com.utec.lab;

import com.utec.lab.model.*;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        var system = BioAlert.getInstance();
        var e1 = new Estudiante("A1", "Juan");
        var e2 = new Estudiante("A2", "Jorge");
        var a = new Autor("Mario", new Date(0));
        var l = new Libro("La insoportable levedad del ser", new Date(20), a);
        var c1 = new Copia("C1", l);
        var c2 = new Copia("C2", l);

        system.registrarCopia(l, c1);
        system.registrarCopia(l, c2);

        system.pedirCopiaPrestada(e1, l.getNombre());
        system.pedirCopiaPrestada(e2, l.getNombre());
    }
}
