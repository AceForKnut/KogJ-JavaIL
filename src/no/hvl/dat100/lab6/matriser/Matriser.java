package no.hvl.dat100.lab6.matriser;

public class Matriser {
	private static int[][] matrise1 = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	private static int[][] matrise2 = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	private static int[][] matrise8 = {
			{0, 0, 1, 1, 1, 1, 0, 0},
		    {0, 1, 0, 0, 0, 0, 1, 0},
		    {0, 1, 0, 0, 0, 0, 1, 0},
		    {0, 0, 1, 1, 1, 1, 0, 0},
		    {0, 1, 0, 0, 0, 0, 1, 0},
		    {0, 1, 0, 0, 0, 0, 1, 0},
		    {0, 1, 0, 0, 0, 0, 1, 0},
		    {0, 0, 1, 1, 1, 1, 0, 0}
	};
	public static void main(String[] args) {
		skrivUt(matrise1);
		
		tilStreng(matrise1);
		
		skaler(2, matrise1);
		
		erLik(matrise1, matrise2);
		
		speile(matrise8);
		
		multipliser(matrise1,matrise2);
	}
	// a)
	public static void skrivUt(int[][] matrise) {
	
		for (int[] rad : matrise) {
			System.out.print("{ ");
			for (int v : rad) {
				System.out.print(v + " ");
				} System.out.print("}");
				System.out.println();
			}
			
		}
	
		
	// b)
	public static String tilStreng(int[][] matrise) {
		System.out.println();
		
		StringBuilder matriseString = new StringBuilder();
		for (int rad = 0; rad < matrise.length; rad++) {
	        for (int linje = 0; linje < matrise[rad].length; linje++) {
	            matriseString.append(matrise[rad][linje] + " ");
	            
	        }
			matriseString.append("\\n");
		}
		System.out.print(matriseString.toString());
		return matriseString.toString();
		
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		System.out.println();
		int[][] matriseD = new int[matrise.length][3];
				for (int i = 0; i<matrise.length; i++) {
					for (int b = 0; b<matrise[i].length; b++) {
					int tallUt = matrise[i][b];
					int tallInn = tallUt * tall;
					matriseD[i][b] = tallInn;
					
					
					
				}
		}
				skrivUt(matriseD);
				return matriseD;
		
	}
	
	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean like = true;
		for (int rad = 0; rad<matrise1.length; rad++) {
			for (int linje = 0; linje<matrise1[rad].length; linje++) {
				if (matrise1[rad][linje] != matrise2[rad][linje]) {
					like = false;
				}
			}
		}
		
		System.out.print(like);
		return like;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		System.out.println();
		int[][] speilet1 = new int[matrise.length][10];
		for (int rad = 0; rad<matrise.length; rad++) {
			for (int linje = 0; linje<matrise[rad].length; linje++) {
				speilet1[rad][linje] = matrise[linje][rad];
			}
		}
		skrivUt(speilet1);
		return speilet1;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		System.out.println();
		int[][] matriseMul = new int[a.length][3];
		for (int i = 0; i<a.length; i++) {
			for (int k = 0; k<a[i].length; k++) {
			int tallUt1 = a[i][k];
			int tallUt2 = b[i][k];
			int tallInn = tallUt1 * tallUt2;
			matriseMul[i][k] = tallInn;
		
			
	}
			
}
		skrivUt(matriseMul);
		return matriseMul;
}
}
