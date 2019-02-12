package autobuska_stanica.proba;

import java.util.GregorianCalendar;

import autobuska_stanica.AutobuskaStanica;
import autobuska_stanica.Polazak;

public class ProbaAutobuskaStanica {

	public static void main(String[] args) {

		AutobuskaStanica a = new AutobuskaStanica();
		
		Polazak p = new Polazak();
		p.setDestinacija("Novi Sad");
		p.setVreme(new GregorianCalendar(2018, 11, 31, 23, 59, 59));
		p.setBrojSlobodnihMesta(55);
		a.unesiPolazak(p);
		System.out.println(p);
		System.out.println();
		a.ispis();
	}

}
