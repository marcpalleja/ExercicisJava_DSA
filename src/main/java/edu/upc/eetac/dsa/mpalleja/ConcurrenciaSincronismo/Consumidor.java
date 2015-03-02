package edu.upc.eetac.dsa.mpalleja.ConcurrenciaSincronismo;


	public class Consumidor implements Runnable{
		 private Buffer buffer = null;

		    public Consumidor(Buffer buffer) {
		        this.buffer = buffer;
		    }


		    public void run() {
		        StringBuilder sb = new StringBuilder();
		        char c;
		        while ((c = buffer.lee()) != '\n') {
		            System.out.println("Se lee " + c);
		            sb.append(c);
		        }
		        System.out.println(sb);
		    }
	}


