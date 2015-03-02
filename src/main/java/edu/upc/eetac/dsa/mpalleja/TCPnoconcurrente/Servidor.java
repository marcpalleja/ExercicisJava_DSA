package edu.upc.eetac.dsa.mpalleja.TCPnoconcurrente;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Servidor {

	public static void main(String args[]) throws IOException {
		int port = 12345; //declaramos el puerto del servidor
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //función que recoge la fecha y hora
		ServerSocket serverSocket = new ServerSocket(port); //declaramos el socket del servidor pasandole el puerto correspondiente
		while (true){
			Socket socket = serverSocket.accept(); //aceptamos las peticiones de los sockets entrantes
            PrintWriter writer = new PrintWriter(socket.getOutputStream()); //enviamos la información al cliente
            writer.println(sdf.format(System.currentTimeMillis()));
            writer.flush(); //limpiamos el buffer
		}
	}
	
}
