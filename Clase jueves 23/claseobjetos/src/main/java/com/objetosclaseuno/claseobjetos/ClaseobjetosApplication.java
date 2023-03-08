package com.objetosclaseuno.claseobjetos;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.objetosclaseuno.claseobjetos.models.Conejo;
import com.objetosclaseuno.claseobjetos.models.Gato;
import com.objetosclaseuno.claseobjetos.models.Miniconejo;
import com.objetosclaseuno.claseobjetos.models.Perro;

@SpringBootApplication
public class ClaseobjetosApplication {

	public static void main(String[] args) {
		
/*creamos el perro llamandolo solo ponemos el nombre del objeto y seleccionamos el primero
 y por deefecto arriba tecre el import arriba */

 //creAMOS PERRO POR defecto llamamos al constructor vacio
   Perro perroDefault = new Perro();
 // aqui creamos al perro entero y en esta ocacion llamamos al segundo constructor con los this   
   Perro perroCompleto = new Perro ("salchicha","cafe",40.5,"corto",'M', 234);
   
/* veamos que nos aparece usando el toString, si yo no pusiera .toString me lo
 llama igual pero no es una buena practica no ponerlo */ 

   System.out.println(perroDefault.toString());
   System.out.println(perroCompleto.toString());

/*para que no salga el tema de null vamos a comenzar  a cambiarle cosas al perro
 asi que tenemos que usar el set, el set puede ser para objetos con algo dentro
 o sin nada adentro (null)*/
 
  perroDefault.setRaza("Quiltro");
  perroDefault.setColor("Blanco");

/*Entonces ahora despues de esos cambios se veria asi  */
 System.out.println(perroDefault.toString());

/* Ahora solo queremos tener solo un dato o valor de los atributos */
System.out.println(perroCompleto.getTamano());

/*Ahora por ejemplo este tamaño crecio porque esta masviejo y crecio 20 cm 
 de la ultima vez automaticamente lo suma */
System.out.println(perroCompleto.getTamano() + 20);

/* podemos guardar en una variable los datos  */
Double tamanioPerroCompleto = perroCompleto.getTamano();
System.out.println(tamanioPerroCompleto);


/* importamos arrailist para poder guardar varios perros  */
ArrayList <Perro> misPerros = new ArrayList<Perro>();
/*le decimos que guarde los datos del perro completo en el arrai */
misPerros.add(perroCompleto);
/*le decimos que guarde los datos del perrodefault en el arrai */
misPerros.add(perroDefault);

System.out.println("desde aqui es el array");
/*aqui llamamos al arrai jiji */
System.out.println(misPerros);


/*para seguir jugando le cambiamos el tamaño otra vez pero al perro default */
/*es de indice 1 el perro default solo por como lo ingresamos al arrai si hubiese 
 puesto al misperros.add(perrodafault) y luego mis perros.add(perrocompkleto)
 hubiese sido indice 0*/
misPerros.get(1).setTamano(89.7);
/* para visualisar esto */
System.out.println("desde aqui es el array modificado");
System.out.println(misPerros);




/**************************************************************************************** */
/***************************************aqui comienza el tema de las herencias******** */


/*creamos un gato al igual que el perrosqui */

Gato michiVacio = new Gato();
Gato michiGordito = new Gato("michigiaton","egipcio", "calvo", true, 12);

System.out.println(michiVacio);
System.out.println(michiGordito);

/*al correr podemos verlo que dice animal y adentro todos los atributos  */

/*creamos al conejo */

Conejo senorBigotes = new Conejo();
Conejo badBunny = new Conejo("Colitas", "Angora", "Peludo", false);
System.out.println("conejo2");
System.out.println(senorBigotes);
System.out.println(badBunny);
/***************************** */


michiVacio.setNombre("pelusa");
senorBigotes.setNombre("señor bigoton");
System.out.println("***********");
System.out.println(michiVacio);
System.out.println(senorBigotes);

/******************************** */
/* aunque sean de la misma herencia del padre enter ellos no se pueden prestar datos (metodos o funcionalidades
particulares )por ejemplo el conejo  no puede maullar o el gato no puede saltar alto*/
michiGordito.maulla();
badBunny.salto();
/**********************ahora polimorfismo que sera como herencia de la herencia abuelo papa hijo 
 con mis palabras por ejemplo un nuevo conejo que es miniconejo est epuede heredar cosas de conejo pero 
 no asi de gato y conejo a la vez, solo puede recibir cosas de conejo y la padre
*/
Miniconejo conejoChiquito = new Miniconejo();
Miniconejo conejoLleno = new Miniconejo("Blanca", "Angora", "peluido", true, tamanioPerroCompleto);

}

}


