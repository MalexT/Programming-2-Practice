package izlozba;

import java.util.GregorianCalendar;

import eksponati.Eksponat;
import eksponati.slike.Slika;

public class Izlozba {

	private GregorianCalendar datumOtvaranja;
	private Eksponat[] eksponati;

	public Izlozba(GregorianCalendar datum) {
		eksponati = new Eksponat[50];
		this.datumOtvaranja = datum;
	}

	public void unesiEksponat(Eksponat e) {
		for (int i = 0; i < eksponati.length; i++) {
			if (eksponati[i] == null && e != null) {
				eksponati[i] = e;
				return;
			}
		}
		System.out.println("GRESKA");
	}

	public void ispisiSveEksponate(String autor) {

		System.out.println("Datum otvaranja: " + this.datumOtvaranja.getTime());

		for (int i = 0; i < eksponati.length; i++) {
			if (eksponati[i] != null && eksponati[i].getAutor().equals(autor))
				eksponati[i].ispisi();
		}
	}

	public Eksponat[] pronadji(String prezime) {
		Eksponat[] novi;
		int brojac = 0;
		for (int i = 0; i < eksponati.length; i++) {
			if (eksponati[i] != null && eksponati[i].getAutor().endsWith(prezime) && eksponati[i] instanceof Slika
					&& ((Slika) eksponati[i]).getTehnika() == "tempera") {
				brojac++;
			}
		}
		novi = new Eksponat[brojac];
		brojac = 0;

		for (int i = 0; i < eksponati.length; i++) {
			if (eksponati[i] != null && eksponati[i].getAutor().endsWith(prezime) && eksponati[i] instanceof Slika
					&& ((Slika) eksponati[i]).getTehnika() == "tempera" && brojac < novi.length) {
				novi[brojac] = eksponati[i];
				brojac++;
			}
		}
		return novi;
	}

}
