package com.objetosclaseuno.claseobjetos.models;

public class Casco {
    public String forma;
    public Double tamano;
    public String color;
    public String calidad;
    public String tipo;

public Casco() {
    }


public Casco(String forma, Double tamano, String color, String calidad, String tipo) {
    this.forma = forma;
    this.tamano = tamano;
    this.color = color;
    this.calidad = calidad;
    this.tipo = tipo;
}



public String getForma() {
    return forma;
}


public void setForma(String forma) {
    this.forma = forma;
}


public Double getTamano() {
    return tamano;
}


public void setTamano(Double tamano) {
    this.tamano = tamano;
}


public String getColor() {
    return color;
}


public void setColor(String color) {
    this.color = color;
}


public String getCalidad() {
    return calidad;
}


public void setCalidad(String calidad) {
    this.calidad = calidad;
}


public String getTipo() {
    return tipo;
}


public void setTipo(String tipo) {
    this.tipo = tipo;
}



public void normativa (){
    System.out.println("Si cumple");
 }

public String proteccion (boolean protege){
    if (protege == true) {
        return "Si protege";
        
    } else {
        return "No Protege";
    }
 }

 public String visibilidad (boolean visible){
    if (visible == true) {
        return "Es visible";
        
    } else {
        return "No es visible";
    }
 }

 }