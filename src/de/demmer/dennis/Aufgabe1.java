package de.demmer.dennis;

import java.util.Arrays;

public class Aufgabe1 {
	
	//main -> STRG +LEERTASTE
	public static void main(String[] args) {
		
		
		int[] intArray  =  new int[150]; 
		
		intArray[0] = 42;
		intArray[1] = 42;
		intArray[2] = 42;
		intArray[3] = 42;
		intArray[4] = 42;
		//...
		
		for (int i = 0; i < intArray.length; i++) {		
			intArray[i] = 42;
		}
		
		
		//Ausgabe in der Konsolse
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println(Arrays.toString(intArray));
		System.out.println(intArray);
		
		
		
		
		
		
	}

}
