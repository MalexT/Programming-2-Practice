package zadatak2.autobuska_stanica.rezervacije;

import zadatak2.autobuska_stanica.Polazak;

public interface RezervacijaKarata {

	public void unesiPolazak(Polazak p) throws Exception;
	
	public boolean rezervisiKarte(String destinacija, int brojKarata);
}
