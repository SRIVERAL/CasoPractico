package main;

public class Punto {
	
	private int x = 0;
	private int y = 0;
	
	public Punto() {
		super();
		this.x = 2;
		this.y = 3;
	}
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punto(Punto coord) {
		super();
		this.x = coord.x;
		this.y = coord.y;
	}

	public void pintar() {
		System.out.println("Punto [x=" + x + ", y=" + y + "]");
	}
	
	
	

}
