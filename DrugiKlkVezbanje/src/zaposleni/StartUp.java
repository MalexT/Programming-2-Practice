package zaposleni;

public class StartUp {

	private Zaposleni[] zaposleni;
	
	public StartUp(int brojZaposlenih) {
		zaposleni = new Zaposleni[brojZaposlenih];
	}
	
	public void dodajZaposlenog(Zaposleni z) {
		for (int i = 0; i < zaposleni.length; i++) {
			if(zaposleni[i]==null && z!=null) {
				zaposleni[i]=z;
				return;
			}
		}
		System.out.println("Nema slobodnih mesta");
	}
	
	public void obracunajPlate(int brojRadnihDana) {
		for (int i = 0; i < zaposleni.length; i++) {
			if(zaposleni[i]!=null) {
				zaposleni[i].izracunajPlatu(brojRadnihDana*8);
			}
		}
	}
	
	public void prikaziIzvestajOPlati() {
		System.out.println("Izvestaj o platama zaposlenih za prethodni mesec");
		for (int i = 0; i < zaposleni.length; i++) {
			if(zaposleni[i]!=null) {
			System.out.println("- " + zaposleni[i].getImePrezime() +" "+ zaposleni[i].getPlata());
			}
		}
	}
	
}
