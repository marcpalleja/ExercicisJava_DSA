package edu.upc.eetac.dsa.mpalleja.Interfaces;

public class Rectangle extends Shape {
	
	private int base;
	private int altura;
	
	public Rectangle(int base, int altura) {
		super("rectangle", area(base, altura));
		this.base = base;
		this.altura = altura;
		
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public static int area (int base, int altura)
	{
		return (base*altura);
	}
	
	
	

}
