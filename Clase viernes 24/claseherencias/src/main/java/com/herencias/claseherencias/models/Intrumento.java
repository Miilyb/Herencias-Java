package com.herencias.claseherencias.models;

public class Intrumento {
 public String nombre;
 public String tipo;
 public Integer cuerdas;
 public String color;

 
public Intrumento() {
}


public Intrumento(String nombre, String tipo, Integer cuerdas, String color) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.cuerdas = cuerdas;
    this.color = color;
}


public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public String getTipo() {
    return tipo;
}


public void setTipo(String tipo) {
    this.tipo = tipo;
}


public Integer getCuerdas() {
    return cuerdas;
}


public void setCuerdas(Integer cuerdas) {
    this.cuerdas = cuerdas;
}


public String getColor() {
    return color;
}


public void setColor(String color) {
    this.color = color;
}


@Override
public String toString() {
    return "Intrumento [nombre=" + nombre + ", tipo=" + tipo + ", cuerdas=" + cuerdas + ", color=" + color + "]";
}


}
