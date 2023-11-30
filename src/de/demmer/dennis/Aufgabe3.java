package de.demmer.dennis;

public class Aufgabe3 {

	
	/**
	 * 
	 * Die Methode irgendeinString.toCharArray() gibt als Rückgabewert einen String als char[] aus. 
	 * Versucht eine Methode void reverse(String string) zu schreiben, 
	 * die einen String in umgekehrter Reihenfolge in der Konsole ausgibt. ( Aus "Java" wird "avaJ")
	 * 
	 */
	
	
	
	static void reverse(String toReverse) {
		
		char[] charArray = toReverse.toCharArray();
		
		for (int i = charArray.length-1;  i >= 0  ; i--) {
			
			System.out.print(charArray[i]);
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		reverse("Apfelkuchen");
		

	}

	
}
