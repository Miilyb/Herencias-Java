package com.herencias.claseherencias.models;

public class Violin extends Intrumento {
    String marcaPeCastilla;

    public Violin() {
        super();
    }

    public Violin(String nombre, String tipo, Integer cuerdas, String color, String marcaPeCastilla) {
        super(nombre, tipo, cuerdas, color);
        this.marcaPeCastilla = marcaPeCastilla;
    }

    public String getMarcaPeCastilla() {
        return marcaPeCastilla;
    }

    public void setMarcaPeCastilla(String marcaPeCastilla) {
        this.marcaPeCastilla = marcaPeCastilla;
    }

    public String melodia (boolean armonioso){
        if (armonioso == true) {
            return "Suena muy melodico";
            
        } else {
            return "Esta desafinado";
        }
     }

    @Override
    public String toString() {
        return super.toString() + "Violin [marcaPeCastilla=" + marcaPeCastilla + "]";
    }





}
