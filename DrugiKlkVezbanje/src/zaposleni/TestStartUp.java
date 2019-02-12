package zaposleni;

public class TestStartUp {

	public static void main(String[] args) {

		StartUp s = new StartUp(3);
		Menadzer z1 = new Menadzer();
		z1.setImePrezime("Novica Grujic");
		KancelarijskiRadnik z2 = new KancelarijskiRadnik();
		z2.setImePrezime("Pera Mikic");
		KancelarijskiRadnik z3 = new KancelarijskiRadnik();
		z2.setImePrezime("Zika Micic");
		s.dodajZaposlenog(z1);
		s.dodajZaposlenog(z2);
		s.dodajZaposlenog(z3);
		s.obracunajPlate(21);
		s.prikaziIzvestajOPlati();
		
	}

}
