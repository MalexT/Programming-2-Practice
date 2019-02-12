package nizovi;

public class Testovi {

	public static void main(String[] args) {

//		zadatak1 z = new zadatak1();
//		z.unosUNiz(4);
//		z.unosUNiz(4);
//		z.unosUNiz(2);
//		z.unosUNiz(8);
//		z.unosUNiz(7);
//		z.unosUNiz(5);
//		z.unosUNiz(1);
//		System.out.println(z.minEl());
//		System.out.println(z.maxEl());
//		System.out.println(z.vratiZbirNiza());
		
		int[] niz = new int[4];
		niz[0] = 1;
		niz[1] = 3;
		niz[2] = 4;
		niz[3] = 6;
		
		int[] niz1 = new int[4];
		niz1[0] = 2;
		niz1[1] = 3;
		niz1[2] = 5;
		niz1[3] = 5;
		
		UsluzneFunkcije.ispisElNiza(niz);
		
		int[] kopija = UsluzneFunkcije.kopijaNiza(niz);
		System.out.println();
		
		UsluzneFunkcije.ispisElNiza(kopija);
		System.out.println();
		
		int[] kopija1 = UsluzneFunkcije.spajanjeDvaniza(niz, niz1);
		UsluzneFunkcije.ispisElNiza(kopija1);
	}

}
