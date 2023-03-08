package com.objetosclaseuno.claseobjetos.models;

public class Miniconejo extends Conejo {
  public Double pesoEnGr;

public Miniconejo() {
    super();
}

public Miniconejo(String nombre, String raza, String pelaje, boolean vacunado, Double pesoEnGr) {
    super(nombre, raza, pelaje, vacunado);
    this.pesoEnGr = pesoEnGr;
}

public Double getPesoEnGr() {
    return pesoEnGr;
}

public void setPesoEnGr(Double pesoEnGr) {
    this.pesoEnGr = pesoEnGr;
}

@Override
public String toString() {
    return super.toString() + "Miniconejo [pesoEnGr=" + pesoEnGr + "]";
}

  









    
}
