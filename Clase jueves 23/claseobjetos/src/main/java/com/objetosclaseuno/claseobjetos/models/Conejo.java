package com.objetosclaseuno.claseobjetos.models;

public class Conejo extends Animal {

   public Double longitudorejas;

public Conejo() {
    super();
}

public Conejo(String nombre, String raza, String pelaje, boolean vacunado) {
    super(nombre, raza, pelaje, vacunado);
}

public Double getLongitudorejas() {
    return longitudorejas;
}

public void setLongitudorejas(Double longitudorejas) {
    this.longitudorejas = longitudorejas;
}

public void salto (){
    System.out.println("brinco brinco");
 }

@Override
public String toString() {
    return super.toString() + "Conejo [longitudorejas=" + longitudorejas + "]";
}




 
    
}
