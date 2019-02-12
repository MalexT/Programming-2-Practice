package zadatak2.autobuska_stanica;

import java.util.LinkedList;
import java.util.List;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import zadatak2.autobuska_stanica.rezervacije.RezervacijaKarata;

public class AutobuskaStanica implements RezervacijaKarata {

	@Override
	public void unesiPolazak(Polazak p) throws Exception {
		if(p==null && polasci.contains(p))
			throw new Exception("Greska");

		polasci.add(0, p);
	}

	@Override
	public boolean rezervisiKarte(String destinacija, int brojKarata) {
		
		for (Polazak polazak : polasci) {
			if(polazak.getDestinacija().equals(destinacija) && polazak.getBrojSlobodnihMesta()>=brojKarata)
				polazak.setBrojSlobodnihMesta(polazak.getBrojSlobodnihMesta()-brojKarata);
			return true;
		}
		return false;
	}

	
	private List<Polazak>polasci = new LinkedList<>();
}
