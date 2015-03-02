package edu.upc.eetac.dsa.mpalleja.Interfaces;

/*public class Interfaces {

 }*/

public class AppInheritance {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(2.5);
		shapes[1] = new Rectangle(3, 5);
		int i = shapes.length;
		int j = 0;
		while (j < i) {
			System.out.println(shapes[j].getTipo() + " with area = "
					+ shapes[j].getArea());
			j++;
		}
	}
}