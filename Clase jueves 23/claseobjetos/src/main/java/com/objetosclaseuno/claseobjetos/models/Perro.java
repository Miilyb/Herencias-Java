package com.objetosclaseuno.claseobjetos.models;

public class Perro {
    //en esta parte tiene que ir los atributos del objeto en este caso perro 
    // se deben de agregar los atributos con el tipo de variable
    /* cuando creamos atributos de objetos en este caso perro podemos determinar si el 
    atributo es privado o publico y que sea uno o otro depende de la sensibilidad del dato */

    /*es como un objeto grande que seria perro compuestos por otros objetos que son
    las que definimos para abajo raza, color,tamaño, pelaje, etc, pero si o si el 
    tipo de variable se define como objeto y eso se diferencia con la primera
    letra en mayuscula SSString DDouble*/

/********** 1 inicio atributos***********************/

    public String raza;
    public String color;
    public Double tamano;
    public String pelaje;
    public char sexo;
    private Integer chip; 

/********* 1 fin de atributos***********************/ 
    
    //Integer es un objeto int es una variable mas simple

/* funciones de tipo constructores nos permiten que nosotros podramos agregar los atributos
al perro esta funcion se crea con click derecho + accion de codigo fuente + generate constructors */

/*los constructores si o si deben de ir debajo de los atributos y juntos  */

/************** 2 inicio constructores******************/

/* 1- el primer constructor es haciendo click derecho + accion de codigo fuente+ generate constructors+
no agrego ningun atributo y le doy a aceptar */

public Perro() {
}
 /* 2 -luego genero el otro cosntructor de la misma forma pero si marco todos 
  los atributos y le doy a aceptar*/

public Perro(String raza, String color, Double tamano, String pelaje, char sexo, Integer chip) {
    this.raza = raza;
    this.color = color;
    this.tamano = tamano;
    this.pelaje = pelaje;
    this.sexo = sexo;
    this.chip = chip;
}
 /****************** 2 fin constructores*****************/

//con get obtengo y con el set modifico 
/*click derecho + accion de codigo fuente + generate geter and seter + seleccioamostodos los atributos y le damos aceptar */
/* si quiero modificar un dato con el set lo hago
 this hace atribucion al objeto que uno creo */


/***************** 3 inicio get y set*****************/
public String getRaza() {
    return raza;
}

public void setRaza(String raza) {
    this.raza = raza;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public Double getTamano() {
    return tamano;
}

public void setTamano(Double tamano) {
    this.tamano = tamano;
}

public String getPelaje() {
    return pelaje;
}

public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
}

public char getSexo() {
    return sexo;
}

public void setSexo(char sexo) {
    this.sexo = sexo;
}

public Integer getChip() {
    return chip;
}

public void setChip(Integer chip) {
    this.chip = chip;
}

/******************* 3 fin get y set*****************/



/*******************4 funcionalidades*************** */
public void ladrar (){
    System.out.println("guau guau!");
 }

public String romperCosas (boolean meRetaron){
    if (meRetaron == true) {
        return "Destrozo";
        
    } else {
        return "No destrozo";
    }
 }

public String cavar(){
   return "El perro cavo un hoyo";
 }

/*******************4 fin funcionalidades*********************/

/*******************5 Metodo to string***********************/
/*click derecho + accion de codigo fuente + to string + y selecciono los atributos
 que yo quiero ver */
/*Esto es para poder imprimir los atributos mas lo que le ponemos a cada atributo */
/*todos los objetos tiene que tener el to String */

@Override
public String toString() {
    return "Perro [raza=" + raza + ", color=" + color + ", tamano=" + tamano + ", pelaje=" + pelaje + ", sexo=" + sexo
            + ", chip=" + chip + "]";
}
   
/*******************5 fin Metodo to string***********************/

    
}



