package com.objetosclaseuno.claseobjetos.models;




/* en la clase padre debemos de hacer todo lo mismo 1-atributos generales, 2- constructores vacio y lleno
 3- get y set 4- to string
 */
public class Animal {
     /*atributos generales  */
public String nombre;
public String raza;
public String pelaje;
public boolean vacunado;

public Animal() {
}

public Animal(String nombre, String raza, String pelaje, boolean vacunado) {
    this.nombre = nombre;
    this.raza = raza;
    this.pelaje = pelaje;
    this.vacunado = vacunado;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getRaza() {
    return raza;
}

public void setRaza(String raza) {
    this.raza = raza;
}

public String getPelaje() {
    return pelaje;
}

public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
}

public boolean isVacunado() {
    return vacunado;
}

public void setVacunado(boolean vacunado) {
    this.vacunado = vacunado;
}

@Override
public String toString() {
    return "Animal [nombre=" + nombre + ", raza=" + raza + ", pelaje=" + pelaje + ", vacunado=" + vacunado + "]";
}









}





/*en otra carpeta en model hago otro archivo de gato */
/*para decirle a gato que debe tener atributos de la clase padre se usala palabra reservada extends*/