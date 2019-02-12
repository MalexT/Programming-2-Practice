package autobuska_stanica;

public class AutobuskaStanica {

	private Polazak[] polasci = new Polazak[100];

	public void unesiPolazak(Polazak polazak) {
		if (polazak == null) {
			System.out.println("GRESKA");
			return;
		}
		for (int i = 0; i < polasci.length; i++) {
			if (polasci[i] == null) {
				polasci[i] = polazak;
				return;
			}
		}
		System.out.println("GRESKA");
	}

	public boolean rezervisiKarte(String nazivDestinacije, int brojKarata) {

		for (Polazak polazak : polasci) {
			if (polazak != null) {
				if (polazak.getDestinacija().equals(nazivDestinacije)) {
					if (polazak.getBrojSlobodnihMesta() >= brojKarata) {
						polazak.setBrojSlobodnihMesta(polazak.getBrojSlobodnihMesta() - brojKarata);
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean proslediRezervaciju(AutobuskaStanica[] a, String destinacija, int brojKarata) {

//		boolean status = false;
		for (int i = 0; i < a.length; i++) {
			if(a[i].rezervisiKarte(destinacija, brojKarata)) {
				return true;
			}
		}
		return false;
//		return status;
	}
}
