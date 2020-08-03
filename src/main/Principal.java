package main;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 3;
		int y = 2;
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println(" ");
		System.out.println("--> Constructor sin parámteros");
		
		Punto coord1 = new Punto();
		
		coord1.pintar();
		
		System.out.println(" ");
		System.out.println("--> Constructor con parámetros");
		
		Punto coord2 = new Punto(x, y);
		
		coord2.pintar();
		
		System.out.println(" ");
		System.out.println("--> Constructor con un Objeto como parámetro");
		
		Punto coord3 = new Punto(coord2);
		
		coord3.pintar();

		Random genCantPuntosRandom = new Random();
		
		System.out.println(" ");
		System.out.println("--> Inicia generación de Puntos Random");
		
		a = 1 + genCantPuntosRandom.nextInt(19);
		
		for (int i = 0; i < a; i++) {
			Random genBRandom = new Random();
			
			b = 1 + genBRandom.nextInt(100);
			
			Random genCRandom = new Random();
			
			c = 1 + genCRandom.nextInt(100);
			
			Punto coord4 = new Punto(b, c);
			
			coord4.pintar();
			
		}

	}

}
