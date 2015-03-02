package edu.upc.eetac.dsa.mpalleja.UDPnoconcurrente;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Cliente {

	private final static int DEFAULT_PORT = 12345;
	
	public static void main(String[] args) throws IOException {
		
		String server = "localhost";
        int port = DEFAULT_PORT;

        byte[] data = new byte[0]; //hacemos un vector de bytes porque es UDP y no va con sockets
        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName(server), port);
        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.send(dp);

        byte[] buffer = new byte[1496];
        dp = new DatagramPacket(buffer, buffer.length); //llenamos el data con el buffer de lo que hemos recibido del servidor
        datagramSocket.receive(dp);
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(dp.getData()));
        String time = dis.readUTF();
        System.out.println(time);

	}

}
