package org.aguzman.genericsclss;

import java.util.ArrayList;
import java.util.List;

public class Camion {

    private List objetos;

    private  int max;

    public Camion() {
        this.max = max;
        this.objetos= new ArrayList();
    }
    public void add(Object obj){
        if(this.objetos.size() <= max) {
            this.objetos.add(obj);
        }else{
            throw new RuntimeException("No hay más expacio");
        }
    }
}
