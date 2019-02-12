package zaposleni;

public class TestZaposleni {

	public static void main(String[] args) {

		KancelarijskiRadnik k = new KancelarijskiRadnik();
		Menadzer m = new Menadzer();
		k.izracunajPlatu(200);
		m.izracunajPlatu(250);
		System.out.println("Plata menadzera je: " + m.getPlata());
		System.out.println("Plata radnika je: "+ k.getPlata());
	}

}
