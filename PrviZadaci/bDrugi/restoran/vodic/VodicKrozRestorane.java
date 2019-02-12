package restoran.vodic;

import java.util.GregorianCalendar;

import restoran.vrsta.Restoran;
import restoran.vrsta.VrstaHrane;

public class VodicKrozRestorane {

	private Restoran[] restorani;

	public VodicKrozRestorane(int kapacitet) {
		if (kapacitet > 0) {
			restorani = new Restoran[kapacitet];
		}
		restorani = new Restoran[20];
	}

	public void unesiRestoran(Restoran r) {
		if(r==null) {
			System.out.println("GRESKA");
			return;
		}
		
		for (int i = restorani.length-1; i >= 0; i--) {
			if (restorani[i] == null) {
				restorani[i] = r;
				return;
			}
		}
		System.out.println("GRESKA");
	}

	public void napraviTopListu(VrstaHrane v, int godina) {

		for (int i = 0; i < restorani.length; i++) {
			if (restorani[i] != null && restorani[i].getHrana().equals(v) && restorani[i].getOcena() == 5
					&& restorani[i].getDatumProcene().get(GregorianCalendar.YEAR) == godina) {
				System.out.println(restorani[i]);
			}
		}
	}

	public Restoran[] napraviTopListu(VrstaHrane v) {
		Restoran[] r = new Restoran[10];
		int brojac = 0;
		int tekucaGodina = GregorianCalendar.YEAR;

		for (int i = 0; i < r.length; i++) {
			r[i] = new Restoran();
		}

		for (int i = 0; i < restorani.length; i++) {
			if (restorani[i] != null && restorani[i].getHrana().equals(v)
					&& restorani[i].getDatumProcene().get(GregorianCalendar.YEAR) == tekucaGodina
					&& restorani[i].getOcena() == 5 && brojac < 10) {
				r[brojac] = r[i];
				brojac++;
			}
		}

		for (int i = 0; i < restorani.length; i++) {
			if (restorani[i] != null && restorani[i].getHrana().equals(v)
					&& restorani[i].getDatumProcene().get(GregorianCalendar.YEAR) == tekucaGodina
					&& restorani[i].getOcena() == 4 && brojac < 10) {
				r[brojac] = r[i];
				brojac++;
			}
		}

		return r;
	}

}
