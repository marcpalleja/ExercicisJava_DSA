package edu.upc.eetac.dsa.mpalleja.ConstructoresSobrecargaSobreescritura;

public class Tree {
	String nombre;
	int metros;

	
	public Tree(int i) {
		this.metros = i;
		this.nombre = "árbol";
	}

	public Tree(String string) {
		this.metros = 0;
		this.nombre = "Roble";
	}

	public Tree() {
		this.metros = 0;
		this.nombre = "árbol";
	}

	public Tree(int i, String string) {
		this.metros = i;
		this.nombre = "Pino";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}
}
