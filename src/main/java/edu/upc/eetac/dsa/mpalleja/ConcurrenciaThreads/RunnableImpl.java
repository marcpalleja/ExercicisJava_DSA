package edu.upc.eetac.dsa.mpalleja.ConcurrenciaThreads;

import java.util.Calendar;
import java.util.Random;

public class RunnableImpl implements Runnable {

	
	int numero_escrituras;
	String ultimo_tiempo;
	int milisegundos = 0;
	int diferenciamilis=0;
	int milisactuales=0;
	int milisanterior= 0;
	Random randomGenerator = new Random();
	
	public RunnableImpl(){
		
	}

	public void run(){
		
		
		for(int i =0;i<10;i++){			
			Calendar cal = Calendar.getInstance();
			milisactuales = cal.get(Calendar.MILLISECOND);	
			
			diferenciamilis = Math.abs(milisactuales - milisanterior);
			
			System.out.println("RUNNABLE " +diferenciamilis+ "ms  Escrituras:"+numero_escrituras);
			
			milisanterior = milisactuales;
			
			try {
				Thread.sleep(randomGenerator.nextInt(2000));
			} catch (InterruptedException e) {
				
			}
			numero_escrituras++;
		}
	}

}
