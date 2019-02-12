package autobuska_stanica;

public class AutobuskaStanica {

	private Polazak[] polasci = new Polazak[100];

	public void unesiPolazak(Polazak p) {
		for (int i = 0; i < polasci.length; i++) {
			if (polasci[i] == null && p != null) {
				polasci[i] = p;
				return;
			}
		}
		System.out.println("GRESKA");
	}

	public boolean rezervisiKarte(String destinacija, int brojKarata) {

		for (int i = 0; i < polasci.length; i++) {
			if (polasci[i] != null && polasci[i].getDestinacija().equals(destinacija)
					&& polasci[i].getBrojSlobodnihMesta() >= brojKarata) {
				polasci[i].setBrojSlobodnihMesta(polasci[i].getBrojSlobodnihMesta() - brojKarata);
				return true;
			}
		}
		return false;
	}

	public boolean proslediRezervaciju(AutobuskaStanica[] a, String destinacija, int brojKarata) {

		for (int i = 0; i < a.length; i++) {
			if (a[i].rezervisiKarte(destinacija, brojKarata)) {
				return true;
			}
		}
		return false;
	}

	public void ispis() {
		for (int i = 0; i < polasci.length; i++) {
			if (polasci[i] != null)
				System.out.println(polasci[i]);
		}
	}
}
