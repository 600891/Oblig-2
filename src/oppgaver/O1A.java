package oppgaver;

public class O1A {
	public static void main (String[] args) {
		int[] numre = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(tilStreng(numre));
		System.out.println(finnesTall(numre, 11));
	}
	public static void skrivUt (int[] tabell) {
		for(int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}
	public static String tilStreng (int[] tabell) {
		String streng = "[";
		for(int i = 0; i<tabell.length; i++) {
			if (i == 0) {
				streng +=(tabell[i]);
			}else {
			streng+= "," + tabell[i];
			}
		}
		streng = streng + "]";
		return streng;
	}
	public static int summer (int[] tabell) {
		int sum = 0;
		for (int i = 0; i<tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}
	
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean finnes = false;
		for(int i = 0; i<tabell.length; i++) {
			if (tall == tabell[i]) {
				finnes = true;
				break;
			}
		}
		return finnes;
	}
}
