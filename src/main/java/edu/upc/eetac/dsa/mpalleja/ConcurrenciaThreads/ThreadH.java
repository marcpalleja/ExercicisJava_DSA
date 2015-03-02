package edu.upc.eetac.dsa.mpalleja.ConcurrenciaThreads;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class ThreadH extends Thread {

	int numero_escrituras;
	String ultimo_tiempo;
	int milisegundos = 0;
	int diferenciamilis=0;
	int milisactuales=0;
	int milisanterior= 0;
	Random randomGenerator = new Random();
	
	@Override
	public void run(){

		
		
		for(int i =0;i<10;i++){			
			Calendar cal = Calendar.getInstance();
			milisactuales = cal.get(Calendar.MILLISECOND);	
			
			diferenciamilis = Math.abs(milisactuales - milisanterior);
			
			System.out.println("THREAD " +diferenciamilis+ "ms  Escrituras:"+numero_escrituras);
			
			milisanterior = milisactuales;
			
			try {
				sleep(randomGenerator.nextInt(2000));
			} catch (InterruptedException e) {
				
			}
			numero_escrituras++;
		}
		
		
	}

}
