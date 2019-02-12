package galerija.proba;

import java.util.GregorianCalendar;

import exponati.Exponat;
import galerija.Galerija;

public class ProbaGalerija {

	public static void main(String[] args) {
		
		Galerija g = new Galerija();
		Exponat e = new Exponat();
		e.setAutor("Petar Markovic");
		e.setNaziv("Bista majke");
		e.setDatumPrijema(new GregorianCalendar(2017, 6, 12));
		e.setCena(144);
		
		g.unesiExponat(e);
		System.out.println(e);
	}

}
