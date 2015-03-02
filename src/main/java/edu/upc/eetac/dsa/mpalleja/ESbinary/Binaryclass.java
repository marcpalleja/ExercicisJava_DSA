package edu.upc.eetac.dsa.mpalleja.ESbinary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binaryclass {

	private int numero;
	private double decimal;
	private char caracter;
	
	public Binaryclass(int i, double d, char c){
		this.numero = i;
		this.decimal = d;
		this.caracter = c;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getDecimal() {
		return decimal;
	}
	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}
	public char getCaracter() {
		return caracter;
	}
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	
	public void EscribirFichero (String Binary) throws IOException  {
		DataOutputStream o = new DataOutputStream(new FileOutputStream(Binary));
		o.writeInt(numero);
		o.writeDouble(decimal);
		o.writeChar(caracter);
		o.close();
	}
	
	public final static Binaryclass LeerFichero (String Binary) throws IOException {
		DataInputStream i = new DataInputStream(new FileInputStream(Binary));
		int numero = i.readInt();
		double decimal = i.readDouble();
		char caracter = i.readChar();
		
		return new Binaryclass (numero, decimal, caracter);
		
	}

}
