package zadatak3;

public class TestOnlineKnjizara {

	public static void main(String[] args) {

		OnlineKnjizara ok = new OnlineKnjizara(5000);
		
		AudioKnjiga ak = new AudioKnjiga();
		ak.setNaziv("London");
		ak.setBrojStrana(1152);
		
		InteraktivnaEKnjiga e = new InteraktivnaEKnjiga();
		e.setBrojAnimacija(50);
		e.setBrojStrana(100);
		e.setNaziv("Toy Story Read-Along");
		
		Knjiga[] nk = new Knjiga[2];
		nk[0] = ak;
		nk[1] = e;
		
		ok.kreirajIzvestaj(nk, 10000);
	}

}
