package org.aguzman.poointerfaces.repositorio.app.hogar;

import org.aguzman.poointerfaces.repositorio.app.jardin.Perro;

import static org.aguzman.poointerfaces.repositorio.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
