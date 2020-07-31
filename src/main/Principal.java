package main;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 3;
		int y = 2;
		
		String coordenada1;
		String coordenada2;
		
		Punto coord1 = new Punto();
		
		coordenada1 = coord1.toString();
		
		System.out.println("Coordenada 1 --> " + coordenada1);
		
		Punto coord2 = new Punto(x, y);
		
		coordenada2 = coord2.toString();
		
		System.out.println("Coordenada 2 --> " + coordenada2);
		
		

	}

}
