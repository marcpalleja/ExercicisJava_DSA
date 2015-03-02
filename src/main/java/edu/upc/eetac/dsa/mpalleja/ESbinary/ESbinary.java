package edu.upc.eetac.dsa.mpalleja.ESbinary;

import java.io.File;
import java.io.IOException;

public class ESbinary {
	public static void main (String [] args) throws IOException {
		
		Binaryclass testWrite = new Binaryclass (14, 5.6, 'm'); 
		testWrite.EscribirFichero("C:/Users/Marc/Desktop/Binary.txt");
		
		Binaryclass testRead = Binaryclass.LeerFichero("C:/Users/Marc/Desktop/Binary.txt");
		System.out.println("numero = " + testRead.getNumero());
		System.out.println("decimal = " + testRead.getDecimal());
		System.out.println("caracter = " + testRead.getCaracter());	
		
		File Binary = new File ("C:/Users/Marc/Desktop/Binary.txt");
		Binary.delete();
	}
}
