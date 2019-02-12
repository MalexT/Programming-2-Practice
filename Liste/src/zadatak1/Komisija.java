package zadatak1;

import java.util.*;

public class Komisija {

	List<ClanKomosije> clanovi;

	public Komisija() {
		clanovi = new LinkedList<>();
	}

	public void unosClana(ClanKomosije ck) {

		if (!(clanovi.contains(ck)))
			clanovi.add(ck);
		else
			System.out.println("Clan se vec nalazi u komisiji");
	}

	public void nevazecaKomisija() {
		if (clanovi.size() > 5) {
			clanovi.clear();
			System.out.println("KOMISIJA JE NEVAZECA.");
		}
	}

	public void izbaciClana(ClanKomosije ck) {

		Iterator<ClanKomosije> iterator = clanovi.iterator();

		while (iterator.hasNext()) {
			ClanKomosije cko = (ClanKomosije) iterator.next();
			if (cko.equals(ck)) {
				iterator.remove();
			return;
			}
		}
	}

	public void ispis() {
		for (ClanKomosije clanKomosije : clanovi) {
			System.out.println(clanKomosije);
		}
	}

}
