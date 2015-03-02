package edu.upc.eetac.dsa.mpalleja.Interfaces;

public class Shape {
	private String tipo;
	private double area;
	
	
	public Shape(String string, double area2) {
		this.setTipo(string);
		this.setArea(area2);
		}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area2) {
		this.area = area2;
	}
}
