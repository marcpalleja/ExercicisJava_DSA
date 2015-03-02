package edu.upc.eetac.dsa.mpalleja.EStext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AverageFileCalculator {
	public final static double average(String Text)
			throws FileParsingException, BigNumberException {

		double contador = 1;
		double suma = 0;
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(Text));
			String linea = null;

			while ((linea = reader.readLine()) != null) {
				try {
					int numero = Integer.parseInt(linea);
					if (numero < 1000) {
						System.out.println("Numero leido: " + numero + "  posicion: "+ contador);
						suma += numero;
						contador++;
					} else {
						try{
						throw new BigNumberException(
								"El número es mayor que 1000"
										+ (int) (contador++));
						}
						catch(BigNumberException e){
							e.printStackTrace();
						}
					}
				} catch (NumberFormatException e) {
					throw new FileParsingException(e.getMessage());
				}
			}
		} catch (java.io.IOException e) {
			throw new FileParsingException(e.getMessage());
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.err.println("No se puede cerrar el archivo");
			}
		}
		return suma / contador;

	}
}
