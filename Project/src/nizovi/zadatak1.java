package nizovi;

public class zadatak1 {

	int[] niz = new int[10];
	int brojac = 0;
	
	void unosUNiz(int broj) {
		niz[brojac]= broj;
		brojac++;
	}
	
	void ispisPrvogElementa() {
		System.out.println(niz[0]);
	}
	void ispisPoslednjegElementa() {
		System.out.println(niz[9]);
	}
	
	void ispisZeljenogElementaNiza(int indeks) {
		System.out.println(niz[indeks]);
	}
	void ispisNiza() {
		for (int i = 0; i < brojac; i++) {
			System.out.println(niz[i]);
		}
	}
	int vratiZbirNiza() {
		int suma = 0;
		for (int i = 0; i < brojac; i++) {
			suma+=niz[i];
		}
		return suma;
	}
	
	int vratiProizvodNiza() {
		int proizvod = 1;
		for (int i = 0; i < brojac; i++) {
			proizvod*=niz[i];
		}
		return proizvod;
	}
	
	int minEl() {
		int a = niz[0];
		for (int i = 1; i <brojac; i++)
			if(niz[i]<a)
				a=niz[i];
		return a;
	}
	int maxEl() {
		int b = niz[0];
		for (int i = 1; i < brojac; i++) {
			if(b<niz[i])
				b=niz[i];
		}
		return b;
	}
	
	boolean nalaziSe(int broj) {
		for (int i = 0; i < brojac; i++) {
			if(niz[i] == broj)
				return true;
		}
	return false;
	}
	
}


