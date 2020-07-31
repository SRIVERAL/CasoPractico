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

	public Punto(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
	

}
