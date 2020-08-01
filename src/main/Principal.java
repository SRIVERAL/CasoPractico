package main;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 3;
		int y = 2;
		
		Punto coord1 = new Punto();
		
		coord1.pintar();
		
		Punto coord2 = new Punto(x, y);
		
		coord2.pintar();
		
		Punto coord3 = new Punto(coord2);
		
		coord3.pintar();
		

	}

}
