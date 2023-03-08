package com.herencias.claseherencias.models;

public class Saxofon extends Intrumento {
    public String boquilla;

    public Saxofon() {
        super();
    }

    public Saxofon(String nombre, String tipo, Integer cuerdas, String color, String boquilla) {
        super(nombre, tipo, cuerdas, color);
        this.boquilla = boquilla;
    }

    public String getBoquilla() {
        return boquilla;
    }

    public void setBoquilla(String boquilla) {
        this.boquilla = boquilla;
    }

    
    public String sonido (boolean suenaBien){
        if (suenaBien == true) {
            return "Maravilloso";
            
        } else {
            return "Suena horrible";
        }
     }

    @Override
    public String toString() {
        return super.toString() + "Saxofon [boquilla=" + boquilla + "]";
    }




}
