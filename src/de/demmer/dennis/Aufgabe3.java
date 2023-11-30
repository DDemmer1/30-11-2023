package de.demmer.dennis;

public class Aufgabe3 {

	
	/**
	 * 
	 * Die Methode irgendeinString.toCharArray() gibt als Rückgabewert einen String als char[] aus. 
	 * Versucht eine Methode void reverse(String string) zu schreiben, 
	 * die einen String in umgekehrter Reihenfolge in der Konsole ausgibt. ( Aus "Java" wird "avaJ")
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		
		//( Aus "Java" wird "avaJ")
		
		String s = "Test";
		
		char[] cArr =  "Apfelkuchen".toCharArray();
		char[] cArr1 =  s.toCharArray();
		
		System.out.println(cArr[0]);
		
		System.out.print("t");
		System.out.print("s");
		System.out.print("e");
		System.out.print("T");
		
	}

	
}
