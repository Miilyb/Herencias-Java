package com.objetospormi.variosperrosporteclado.models;

public class Perro {

/******************* 1 INICIO ATRIBUTOS ***********************/
    public String raza;
    public String color;
    public Double tamano;
    public String pelaje;
    public char sexo;
    private Integer chip;

/******************* 1 FIN ATRIBUTOS ***********************/

/******************* 2 INICIO CONSTRUCTORES***********************/
    public Perro() {
    }

    public Perro(String raza, String color, Double tamano, String pelaje, char sexo, Integer chip) {
        this.raza = raza;
        this.color = color;
        this.tamano = tamano;
        this.pelaje = pelaje;
        this.sexo = sexo;
        this.chip = chip;
    }

/******************* 2 FIN CONSTRUCTORES ***********************/

/******************* 3 INICIO GET-SET ***********************/
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
/******************* 3 FIN GET-SET ***********************/

/******************* 4 FUNCIONALIDAD ***********************/
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

/******************* 4 FIN FUNCIONALIDAD ***********************/

/******************* 5 INICIO METODO TO STRING***********************/

    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", color=" + color + ", tamano=" + tamano + ", pelaje=" + pelaje + ", sexo="
                + sexo + ", chip=" + chip + "]";
    }

/******************* 5 FIN METODO TO STRING ***********************/















    
}
