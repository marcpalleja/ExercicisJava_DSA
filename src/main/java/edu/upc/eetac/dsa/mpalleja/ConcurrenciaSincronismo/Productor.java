package edu.upc.eetac.dsa.mpalleja.ConcurrenciaSincronismo;

public class Productor implements Runnable {
	private Buffer buffer = null;
	private String texto = null;

	public Productor(Buffer buffer, String texto) {
		this.buffer = buffer;
		this.texto = texto;
	}

	public void run() {
		char chars[] = texto.toCharArray();
		for (char c : chars) {
			buffer.escribe(c);
			System.out.println("Pinche tete writ " + c);
		}
	}
}
