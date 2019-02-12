package restoran.proba;

import java.util.GregorianCalendar;

import restoran.vodic.VodicKrozRestorane;
import restoran.vrsta.Restoran;
import restoran.vrsta.VrstaHrane;

public class ProbaVodicKrozRestorane {

	public static void main(String[] args) {

		VodicKrozRestorane vodic = new VodicKrozRestorane(4);
		
		Restoran r = new Restoran();
		r.setHrana(VrstaHrane.KINESKA);
		r.setNaziv("Makao");
		r.setDatumProcene(new GregorianCalendar(2012, 11, 26));
		r.setOcena(5);
		
		Restoran r1 = new Restoran();
		r1.setHrana(VrstaHrane.DOMACA);
		r1.setNaziv("Kuhinja");
		r1.setDatumProcene(new GregorianCalendar(2017, 10, 01));
		r1.setOcena(4);
		
		vodic.unesiRestoran(r);
		vodic.napraviTopListu(VrstaHrane.KINESKA);
		System.out.println(r);
		System.out.println();
		System.out.println();
		System.out.println(r1);
		System.out.println();
		vodic.napraviTopListu(VrstaHrane.KINESKA, 2012);
	}

}
