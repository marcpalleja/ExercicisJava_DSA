package edu.upc.eetac.dsa.mpalleja.ConcurrenciaSincronismo;

public class App {
	public static void main(String[] args) {

		String texto = "ow mai god disis incredibel tiroriro tirori tirorirorirota. \n";
		Buffer buffer = new Buffer();

		Thread productor = new Thread(new Productor(buffer, texto));
		Thread consumidor = new Thread(new Consumidor(buffer));

		consumidor.start();
		productor.start();
	}
}