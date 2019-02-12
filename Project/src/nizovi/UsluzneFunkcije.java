package nizovi;

public class UsluzneFunkcije {
	
	static void ispisElNiza(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}
	
	static void ispisRealnogNiza(double[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
	}
	
	static int[] kopijaNiza(int[] niz) {
		
		int[] nizKopija = new int[niz.length];
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			nizKopija[brojac++] =niz[i];
		}
		return nizKopija;
	}
	
	static int[] spajanjeDvaniza(int[] niz1, int[] niz2) {
		int[] niz3 = new int[niz1.length + niz2.length];
		int brojac = 0;
		for (int i = 0; i < niz1.length; i++) {
			niz3[brojac++]=niz1[i];
		}
		for (int i = 0; i < niz2.length; i++) {
			niz3[brojac++]=niz2[i];
		}
		return niz3;
	}
}
