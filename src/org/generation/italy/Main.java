package org.generation.italy;

import org.generation.italy.model.Animale;
import org.generation.italy.model.Cane;
import org.generation.italy.model.Gatto;

public class Main {

	public static void main(String[] args) {
		Cane c=new Cane();
		
		Gatto g=new Gatto();
		
		
		System.out.println("CANE:");
		c.faiVerso();
		c.dormi();
		
		
		System.out.println("\nGATTO:");
		g.faiVerso();
		g.dormi();

		
		Animale a; 			
		
		
		// a=new Animale();    		//non posso creare un'istanza di un'interfaccia (ho tutto "in sospeso")
		
		a=new Cane();				//polimorfismo
		a=new Gatto();				//polimorfismo
	}

}
