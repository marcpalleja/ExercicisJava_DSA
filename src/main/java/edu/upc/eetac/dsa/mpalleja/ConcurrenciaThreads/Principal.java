package edu.upc.eetac.dsa.mpalleja.ConcurrenciaThreads;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		
		ThreadH th = new ThreadH();
		RunnableImpl r = new RunnableImpl();
		
		Thread th1 = new Thread(r);
		
		th.start();
		th1.start();
		
		th.join();
		
		th1.join();

	}
	


}
