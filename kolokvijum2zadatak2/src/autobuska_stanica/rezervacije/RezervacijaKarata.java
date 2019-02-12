package autobuska_stanica.rezervacije;

import autobuska_stanica.Polazak;

public interface RezervacijaKarata {

	public void unesiPolazak(Polazak p) throws Exception;
	
	public boolean rezervisiKarte(String destinacija, int brojKarata);
}
