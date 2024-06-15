package org.aguzman.poointerfaces.repositorio.app.jardin;

import org.aguzman.poointerfaces.repositorio.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
