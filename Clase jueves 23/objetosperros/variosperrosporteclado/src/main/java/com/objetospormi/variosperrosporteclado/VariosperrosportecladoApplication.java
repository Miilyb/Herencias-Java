package com.objetospormi.variosperrosporteclado;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.objetospormi.variosperrosporteclado.models.Perro;
import java.util.ArrayList; 

import java.util.Scanner;

@SpringBootApplication
public class VariosperrosportecladoApplication {

 

	public static void main(String[] args) {
	  Scanner teclado = new Scanner(System.in);

      int cantidadPerros;

      do{
	   System.out.print("¿Cuantos Perros quiere registrar?: ");
	   cantidadPerros = teclado.nextInt();

	  if(cantidadPerros <= 0){
		System.out.print("ingrese un valor mayor a cero, si no para que esta aqui .-.");
	}

      }while(cantidadPerros <= 0);
ArrayList<Perro> todosLosPerros = new ArrayList<Perro>();
	  for(int i = 1; i <= cantidadPerros; i++){
		
		//creacion del perro 
		Perro perroModelo = new Perro();
		teclado.nextLine();

		
		System.out.print("Ingresa los datos solicitados ");
		System.out.print("Ingresa la Raza: " + i + " ");
		//llamamo al perro creado 
		perroModelo.setRaza(teclado.nextLine());

		System.out.print("Ingresa el color: " + i + " ");
		perroModelo.setColor(teclado.nextLine());

		System.out.print("Ingresa el tamaño: " + i +" ");
		perroModelo.setTamano(teclado.nextDouble());

		System.out.print("Ingresa pelaje: " + i + " ");
		perroModelo.setPelaje(teclado.nextLine());

		System.out.print("Ingresa ingresa sexo: " + i + " ");
		perroModelo.setSexo(teclado.nextLine().charAt(0));

        System.out.print("Ingresa numero de chip: " + i + " ");
		perroModelo.setChip(teclado.nextInt());
		
	    todosLosPerros.add(perroModelo);
		}
		
		System.out.println("Los perritos registrados son: ");
		System.out.println(todosLosPerros);
		
	}

		
}


