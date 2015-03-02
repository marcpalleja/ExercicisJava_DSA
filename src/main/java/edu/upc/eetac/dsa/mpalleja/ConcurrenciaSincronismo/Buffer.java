package edu.upc.eetac.dsa.mpalleja.ConcurrenciaSincronismo;

public class Buffer {

    private char[] buffer;
    private int leido;
    private int escrito;

    public Buffer() {
        buffer = new char[32];
        this.leido = 0;
        this.escrito = 0;
    }
	
	public synchronized char lee(){
		
		if (leido == escrito) //esperamos a que se escriba mas
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

        char c = buffer[leido];
        leido++;
        
        // si hemos leido hasta el final del buffer comenzamos por el principio otra vez
        if (leido == buffer.length) {					
        	leido = 0;
        }
        
        notifyAll();
        return c;
	}
	
	public synchronized void escribe(char c){
		
		//esperamos a que se lea más. Si no sobrescribiriamos antes de llegar a leer. Mallll
		if ((escrito + 1 == leido) || (escrito == (buffer.length - 1) && leido == 0)) 
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		
        buffer[escrito] = c;
        escrito++;
        
        // si hemos escrito hasta el final del buffer comenzamos por el principio otra vez
        if (escrito == buffer.length) {
        	escrito = 0;
        }
        
        notifyAll();
        
	}
	
}
