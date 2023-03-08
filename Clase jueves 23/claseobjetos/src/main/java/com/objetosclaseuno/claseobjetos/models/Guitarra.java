package com.objetosclaseuno.claseobjetos.models;

public class Guitarra {

    public String forma;
    public Double tamano;
    public String color;
    public Integer cuerdas;
    public String tipo;


 public Guitarra() {
    }


public Guitarra(String forma, Double tamano, String color, Integer cuerdas, String tipo) {
    this.forma = forma;
    this.tamano = tamano;
    this.color = color;
    this.cuerdas = cuerdas;
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


public Integer getCuerdas() {
    return cuerdas;
}


public void setCuerdas(Integer cuerdas) {
    this.cuerdas = cuerdas;
}


public String getTipo() {
    return tipo;
}


public void setTipo(String tipo) {
    this.tipo = tipo;
}

 

public void hacerMusica (){
    System.out.println("Sirve para hacer musica");
 }

public String diversion (boolean divierte){
    if (divierte == true) {
        return "Si divierte";
        
    } else {
        return "No divierte";
    }
 }

 public String terapeutico (boolean terapia){
    if (terapia == true) {
        return "Sirve para terapia";
        
    } else {
        return "No sirve como terapia";
    }
 }
   
 public String motricidad(){
    return "Sirve para la motricidad";
  }

}
