package edu.upc.eetac.dsa.mpalleja.TCPnoconcurrente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String args[]) throws UnknownHostException,
			IOException {
		
		String server = "localhost"; //añadimos IP del servidor que nos queremos conectar
		int port = 12345; //añadimos el puerto al que nos queremos conectar
		Socket s = new Socket(server, port); //declaras el socket del cliente y le pasas el servidor y el puerto del servidor
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				s.getInputStream())); //función que lee lo que le llega del servidor
		String time = reader.readLine(); // lee la línea que le pasa el reader
		System.out.println(time);
	}
	
}
