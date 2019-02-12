package taksi.firma;

import java.util.GregorianCalendar;

import taksi.TaksiVozilo;

public class TaksiFirma {

	private TaksiVozilo[] vozila = new TaksiVozilo[1000];

	public void unesiTaksistu(TaksiVozilo t) {
		for (int i = vozila.length - 1; i >= 0; i--) {
			if (vozila[i] == null && t != null) {
				vozila[i] = t;
				vozila[i].setBrojPoziva(0);
				return;
			}
		}
		System.out.println("NEMA MESTA");
	}

	public void primiPoziv(int taksiBroj, String ime, String prezime) {

		for (int i = 0; i < vozila.length; i++) {
			if (vozila[i] != null && vozila[i].getId().equals("" + taksiBroj + " " + ime + " " + prezime)) {
				if (vozila[i].getKrajSmene().before(new GregorianCalendar())) {
					System.out.println("KRAJ SMENE");
					return;
				} else {
					vozila[i].setBrojPoziva(vozila[i].getBrojPoziva() + 1);
					vozila[i].setSlobodan(false);
				}

			}
		}

		System.out.println("NE POSTOJI");
	}

	public void uredi() {
		TaksiVozilo[] pom = new TaksiVozilo[1000];
		int brojac1 = 0;
		int brojac2 = 0;

		for (int i = 0; i < vozila.length; i++) {
			if (vozila[i] != null)
				if (vozila[i].isSlobodan()) {
					pom[brojac1] = vozila[i];
					brojac1++;
				} else {
					pom[999 - brojac2] = vozila[i];
					brojac2++;
				}
		}
		vozila = pom;
	}

}
