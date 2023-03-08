package com.objetosclaseuno.claseobjetos.models;

public class Computador {
    public String forma;
    public Double tamano;
    public String color;
    public Integer teclas;
    public Integer componentes;

    
    public Computador() {
    }


    public Computador(String forma, Double tamano, String color, Integer teclas, Integer componentes) {
        this.forma = forma;
        this.tamano = tamano;
        this.color = color;
        this.teclas = teclas;
        this.componentes = componentes;
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


    public Integer getTeclas() {
        return teclas;
    }


    public void setTeclas(Integer teclas) {
        this.teclas = teclas;
    }


    public Integer getComponentes() {
        return componentes;
    }


    public void setComponentes(Integer componentes) {
        this.componentes = componentes;
    }



    public String programa (boolean programar){
        if (programar == true) {
            return "Si sirve para progamar";
            
        } else {
            return "No sirve para programar";
        }
     }
    
     public String juego (boolean jugar){
        if (jugar == true) {
            return "Sirve para jugar";
            
        } else {
            return "No sirve para jugar";
        }
     }
       
    
     public String navegar (boolean red){
        if (red == true) {
            return "Sirve para navegar por la red";
            
        } else {
            return "No sirve para navegar en la red";
        }
     }
       
     public String estudio (boolean estudiar){
        if (estudiar == true) {
            return "Sirve para estudiar";
            
        } else {
            return "No sirve para estudiar";
        }
     }

     public String relacionar (boolean comunicacion){
        if (comunicacion == true) {
            return "Sirve para comunicarse digitalmente";
            
        } else {
            return "No sirve para comunicarse digitalmente";
        }
     }

}