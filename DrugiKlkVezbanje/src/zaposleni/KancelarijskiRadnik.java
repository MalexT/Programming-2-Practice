package zaposleni;

public class KancelarijskiRadnik extends Zaposleni {

	@Override
	public void izracunajPlatu(double brojSati) {
		plata = 100 * brojSati;
	}

}
