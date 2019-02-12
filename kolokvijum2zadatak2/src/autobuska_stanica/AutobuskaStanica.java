package autobuska_stanica;

import java.util.LinkedList;
import java.util.List;

import autobuska_stanica.rezervacije.RezervacijaKarata;

public class AutobuskaStanica implements RezervacijaKarata {

	@Override
	public void unesiPolazak(Polazak p) throws Exception {

		if (p != null && !polasci.contains(p))
			polasci.add(0, p);
		else
			throw new Exception("Bilo je problema pri unosu polaska.");
	}

	@Override
	public boolean rezervisiKarte(String destinacija, int brojKarata) {

		for (Polazak polazak : polasci) {
			if (polazak.getDestinacija().equals(destinacija) && polazak.getBrojSlobodnihMesta() - brojKarata >= 0) {
				polazak.setBrojSlobodnihMesta(polazak.getBrojSlobodnihMesta() - brojKarata);
				return true;
			}
		}
		return false;
	}

	private List<Polazak> polasci = new LinkedList<>();

}
