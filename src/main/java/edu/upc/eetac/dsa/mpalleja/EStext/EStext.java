package edu.upc.eetac.dsa.mpalleja.EStext;

public class EStext{
public static void main (String [] args){
	 try {
         double average = AverageFileCalculator.average("C:/Users/Marc/Desktop/Text.txt");
         System.out.println("Average = " + average);
	 }
	 catch (FileParsingException e) {
         e.printStackTrace();
     } catch (BigNumberException e) {
         e.printStackTrace(); }
   
	 }
}

