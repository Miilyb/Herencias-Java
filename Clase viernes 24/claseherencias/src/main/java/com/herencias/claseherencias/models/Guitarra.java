package com.herencias.claseherencias.models;

public class Guitarra extends Intrumento {
    public Integer cantidadCapsulas;

    public Guitarra() {
        super();
    }

    public Guitarra(String nombre, String tipo, Integer cuerdas, String color, Integer cantidadCapsulas) {
        super(nombre, tipo, cuerdas, color);
        this.cantidadCapsulas = cantidadCapsulas;
    }

    public Integer getCantidadCapsulas() {
        return cantidadCapsulas;
    }

    public void setCantidadCapsulas(Integer cantidadCapsulas) {
        this.cantidadCapsulas = cantidadCapsulas;
    }

    public void melodia (){
        System.out.println("woooow!!");
     }

    @Override
    public String toString() {
        return super.toString() + "Guitarra [cantidadCapsulas=" + cantidadCapsulas + "]";
    }









    
}
