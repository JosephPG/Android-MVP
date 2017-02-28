package com.example.one_x_ub.pruebamvp.Objetos;

import java.util.ArrayList;
import java.util.List;

public class Temas {

    private String tema_nombre;
    private List<Temas> tema_lista;

    public Temas(String tema_nombre){
        this.tema_nombre = tema_nombre;
    }

    public String getTema_nombre() {
        return this.tema_nombre;
    }

    public void addElementList(String subtema){
        if(tema_lista == null){
            tema_lista = new ArrayList<>();
        }
        tema_lista.add(new Temas(subtema));
    }

    public Temas getTema(int pos){
        return tema_lista.get(pos);
    }


}
