package com.herencias.claseherencias;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.herencias.claseherencias.models.Guitarra;
import com.herencias.claseherencias.models.Saxofon;
import com.herencias.claseherencias.models.Violin;



@SpringBootApplication
public class ClaseherenciasApplication {

	public static void main(String[] args) {
		
      Guitarra guitarraInicial = new Guitarra();
      Guitarra guitarraConCarac = new Guitarra("Tigresa", "Electrica", 6 ,"Naranja", 4);
      System.out.println(guitarraInicial);
	  System.out.println(guitarraConCarac);

	  Saxofon saxfonInicial = new Saxofon();
      Saxofon saxofonConCarac = new Saxofon("Juanin", "viento", 0, "Dorado", "Una");
      System.out.println(saxfonInicial);
	  System.out.println(saxofonConCarac);

	  Violin violinInicial = new Violin();
      Violin violinConCarac = new Violin("Josefa", "Acustico", 4, "Negro", "Doñajosefa");
      System.out.println(violinInicial);
	  System.out.println(violinConCarac);

	}

}
