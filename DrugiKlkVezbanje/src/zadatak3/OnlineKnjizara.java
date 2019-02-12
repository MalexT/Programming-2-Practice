package zadatak3;

public class OnlineKnjizara {

	Knjiga[]  knjige;
	
	public OnlineKnjizara(int brojKnjiga) {
	knjige = new Knjiga[brojKnjiga];
	}
	
	public void dodajKnjigu(Knjiga k) {
		for (int i = 0; i < knjige.length; i++) {
			if(knjige[i]==null && k!=null) {
				knjige[i]=k;
				return;
			}
		}
		System.out.println("Nema mesta u knjizari");
	}
	
	
	public void kreirajIzvestaj(Knjiga[] knjige, double osnovnaCena) {
		double ukupnaVrednost = 0;
		for (int i = 0; i < knjige.length; i++) {
			dodajKnjigu(knjige[i]);	
			double ukupnaCena = knjige[i].odrediCenu(osnovnaCena);
			ukupnaVrednost+=ukupnaCena;
			System.out.println("- " + knjige[i].getNaziv() + ": " + ukupnaCena + " novcanih jedinica");
			}
		System.out.println("ukupna vrednost isporuke: "+ ukupnaVrednost);
	}
}
