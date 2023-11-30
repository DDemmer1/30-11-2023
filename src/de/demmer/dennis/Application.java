package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
		
			
		String[] alternative = {"Mehl", "Butter", "Milch"};
		
		
		int[] intArray = new int[25000];
		double[] dArray = new double[25000];
		
		
											//größe des Arrays 5
		String[] einkausliste = new String[        5             ];
			
		//         0        1         2             3           4
		//    |  null  |   null  | "Mehl" |  "Schokolade"  |  null  |
		
		
		einkausliste[2] = "Butter";
		einkausliste[2] = "Mehl";
		
		einkausliste[3] = "Schokolade";	
		
		String s = "Hello World";
		char c = s.charAt(0);
		System.out.println(c);
		
		
		//Code wirft NullPointerException
//		char c1 = einkausliste[4].charAt(0);
//		System.out.println(c1);
		
		
		
		
		//         0        1         2             3           4
		//    |  null  |   null  | "Mehl" |  "Schokolade"  |  null  |
		
		
									//5
		for(int i = 0;  i < einkausliste.length ; i++ ) {
			System.out.print(einkausliste[i] + " | ");
			
		}
		
		
		
		
		
	}

}
