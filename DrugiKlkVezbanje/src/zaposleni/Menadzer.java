package zaposleni;

public class Menadzer extends Zaposleni {

	@Override
	public void izracunajPlatu(double brojSati) {
		plata = 1000 * brojSati;
	}

}
