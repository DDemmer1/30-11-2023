package de.demmer.dennis;

public class Aufgabe2 {
	
	
/*
 * Füllt jeden Wert des Arrays zufällig mit 1 oder 0

 - Math.random() gibt einen zufälligen double Wert zurück
 - Math.round() kann einen float oder double runden gibt jedoch einen long zurück
 - mit (int) kann man Datentypen zu einem Integer casten
 
 * 
 */

	
	public static void main(String[] args) {
		//gibt eine Zahl von 0 bis 1 zurück   Zb. 0.1622566
		
		
		double rnd = Math.random();
		System.out.println(rnd);
		
		
		long l = Math.round(0.56334);
		System.out.println(l);
		
		
		int i = (int) 3453465365L;
		
		
		
		
	}
	
	

}
