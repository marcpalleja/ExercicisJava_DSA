package edu.upc.eetac.dsa.mpalleja.Interfaces;

public class Circle extends Shape {
	

	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circle(double radio) {
		super("circle", area(radio));
		this.radio = radio;
	}
	
	public static double area (double radio)
	{
		return (Math.PI*radio*radio);
	}
}
