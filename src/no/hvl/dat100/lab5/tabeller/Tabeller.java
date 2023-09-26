package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
		
	// a)
		public static void main(String[] args) {
			int[] UniTab = {1,2,3,4,5};	
			int[] UniTab2 = {2,4,6,8};  //La til en main for å teste kjøring <3
			skrivUt(UniTab);
			
			tilStreng(UniTab);
			
			summer(UniTab);
			
			finnesTall(UniTab, 6);
			
			posisjonTall(UniTab, 13);
			
			reverser(UniTab);
			
			erSortert(UniTab);
			
			settSammen(UniTab, UniTab2);
		}
	public static void skrivUt(int[] tabell) {
		
		System.out.print("[ ");
		  
		for(int i = 0; i<tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		 if ( i <tabell.length -1) {
			System.out.print(", ");
		}
			
		}
		System.out.print(" ]");
		
	}

	// b)
	public static String tilStreng(int[] tabell) {
		System.out.println();
		System.out.print("[ ");
		StringBuilder tabstring = new StringBuilder();
		for (int i = 0; i<tabell.length; i++) {
			tabstring.append(tabell[i]);
			if ( i <tabell.length -1) {
				tabstring.append(", ");
			}
		}
		System.out.print(tabstring.toString());
		System.out.print(" ]");
		return tabstring.toString();

	}

	// c)
	public static int summer(int[] tabell) {
		//Vanlig for-lokke
//		System.out.println();
//		int x = 0;
//		for (int i = 0; i <tabell.length; i++) {
//		 int nyverdi = tabell[i];
//		 x = x + nyverdi;
//		}
//		System.out.println(x);
//		
//		return x;
		
		//While-lokke
//		int pos = 0;
//		int resultat = 0;
//		System.out.println();
//		while (pos<=tabell.length-1) {
//			int nyverdi = tabell[pos];
//			resultat = resultat + nyverdi;
//			pos++;
//		} System.out.println(resultat);
//		return resultat;
		
		//Utvidet for-lokke
		System.out.println();
		int sum = 0;
		for ( int tall : tabell) {
			int nyverdi = tall;
			sum = sum + nyverdi;
		} System.out.print(sum);
		return sum;
	}	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		System.out.println();
		int pos = 0;
		boolean TallEx = false;
		while (!TallEx && pos<tabell.length) {
			if (tall == tabell[pos]) {
				TallEx = true;
			}
			pos++;
		}	System.out.print(TallEx);
		return TallEx;

		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		System.out.println();
		
		
		for (int pos = 0; pos<tabell.length; pos++) {
			if (tall == tabell[pos]) {
				System.out.print(pos);
				return pos;
			}
		}
		System.out.print(-1);
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		System.out.println();
		System.out.print("[ ");
		for (int i = tabell.length-1; i>=0;i--) {
			System.out.print(tabell[i]);
			if(i > 0) {
				System.out.print(", ");
			} 
		} System.out.print(" ]");
		return tabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		System.out.println();
		int pos = 0;
		boolean sortert = true;
		while (sortert && pos<tabell.length-1) {
			if (tabell[pos]>tabell[pos+1]) {
				sortert = false;
			} pos++;
		}	System.out.print(sortert);
		
		return sortert;
	} 

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		System.out.println();
		int totallengde = tabell1.length + tabell2.length;
		int[] nytab = new int[totallengde];
		System.out.print("[ ");
		for (int i = 0; i<tabell1.length; i++) {
			nytab[i] = tabell1[i];
		}
			for (int i = 0; i<tabell2.length; i++) {
				nytab[i + tabell1.length] = tabell2[i];
			}
			for (int i = 0; i<nytab.length; i++) {
				System.out.print(nytab[i]);
				if (i<nytab.length-1) {
					System.out.print(", ");
			}
			
		
		}	System.out.print(" ]");
			return nytab;
		
	}
}

