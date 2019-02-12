package izlozba.proba;

import java.util.GregorianCalendar;

import eksponati.Eksponat;
import eksponati.slike.Slika;
import izlozba.Izlozba;

public class ProbaIzlozba {

	public static void main(String[] args) {

		Izlozba i = new Izlozba(new GregorianCalendar(2019, 9, 23));
		Eksponat e = new Eksponat();
		e.setAutor("Yoko Ono");
		e.setNaziv("John Lennon");
		Slika s = new Slika();
		s.setTehnika("tempera");
		s.setAutor("Yoko Ono");
		s.setNaziv("PENIS");
		i.unesiEksponat(e);
		i.ispisiSveEksponate(e.getAutor());
		i.unesiEksponat(s);
		i.pronadji("Ono");
	}

}
