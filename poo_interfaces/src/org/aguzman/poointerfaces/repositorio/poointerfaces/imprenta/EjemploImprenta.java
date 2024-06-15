package org.aguzman.poointerfaces.repositorio.poointerfaces.imprenta;

import org.aguzman.poointerfaces.repositorio.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("John", "Doe"),
                "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("Spring Framework")
        .addExperiencia("Desarrollador fullstack")
        .addExperiencia("Angular");

        Libro libro =  new Libro(new Persona("Erich", "Gamma"),
                "Patrones de diseños: Elem. Reusables POO",
                Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"), "Estudio sobre microservicios");

        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);
        Imprimible.imprimir(libro);

        Imprimible.imprimir(new Imprimible(){
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima!";
            }
        });

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }

}
