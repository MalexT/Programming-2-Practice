package galerija;

import java.util.GregorianCalendar;

import exponati.Exponat;
import exponati.skulpture.Skulpture;

public class Galerija {

	Exponat[] eksponati;

	public Galerija() {
		eksponati = new Exponat[100];
	}
	
	private boolean postojiUNizu(Exponat e) {
		for (int i = 0; i < eksponati.length; i++) {
			if(eksponati[i]!=null && eksponati[i].equals(e)) {
				return true;
			}
		}
		return false;
		
	}

	public void unesiExponat(Exponat e) {
		for (int i = 0; i < eksponati.length; i++) {
			if (eksponati[i] == null && e != null && postojiUNizu(e)==false) {
				eksponati[i] = e;
				return;
			}
		}
		System.out.println("GRESKA");
	}

	public void uvediPopust(double popust) {
		int prethodnaGodina = GregorianCalendar.YEAR;
		for (int i = 0; i < eksponati.length; i++) {
			if (eksponati[i] != null && eksponati[i].getDatumPrijema().get(GregorianCalendar.YEAR) == prethodnaGodina) {
				eksponati[i].setCena(eksponati[i].getCena() * ((popust) / 100));
			}
		}
	}

	public Skulpture[] vratiNajskuplje() {
		int maxIndeks = -1;
		int maxIndeks2 = -1;
		double maxCena = 0;

		Skulpture[] s = new Skulpture[2];

		for (int i = 0; i < eksponati.length; i++) {
			if (eksponati[i] != null && eksponati[i].getCena() > maxCena && eksponati[i] instanceof Skulpture) {
				maxIndeks = i;
			}
		}

		for (int i = 0; i < eksponati.length; i++) {
			if (eksponati[i] != null && eksponati[i].getCena() > maxCena && eksponati[i] instanceof Skulpture
					&& i != maxIndeks) {
				maxIndeks2 = i;
			}
		}
		s[0] = ((Skulpture) eksponati[maxIndeks]);
		s[1] = ((Skulpture) eksponati[maxIndeks2]);
		return s;
	}
}
