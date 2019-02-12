package zadatak6.prijemni;

import zadatak6.prijemni.izuzeci.PrijemniException;

public class PrijemniIspit {

	private String nazivUstanove;
	private int godinaUpisa;
	private int brojMesta;
	private int brojPrijavljenih;

	public String getNazivUstanove() {
		return nazivUstanove;
	}

	public int getGodinaUpisa() {
		return godinaUpisa;
	}

	public int getBrojMesta() {
		return brojMesta;
	}

	public int getBrojPrijavljenih() {
		return brojPrijavljenih;
	}

	public void setNazivUstanove(String nazivUstanove) {
		if (nazivUstanove == null || nazivUstanove.length() < 5)
			throw new PrijemniException("Naziv ustanove mora biti duzi od pet karaktera");
		this.nazivUstanove = nazivUstanove;
	}

	public void setGodinaUpisa(int godinaUpisa) {
		if (godinaUpisa < 0)
			throw new PrijemniException("Greska pri unosu godine upisa");
		this.godinaUpisa = godinaUpisa;
	}

	public void setBrojMesta(int brojMesta) {
		if (brojMesta < 0)
			throw new PrijemniException("Greska pri unosu broja slobodnih mesta");
		this.brojMesta = brojMesta;
	}

	public void setBrojPrijavljenih(int brojPrijavljenih) {
		if (brojPrijavljenih < 0)
			throw new PrijemniException("Greska pri unosu broja prijavaljenih osoba.");
		this.brojPrijavljenih = brojPrijavljenih;
	}

	@Override
	public String toString() {
		return "PrijemniIspit [nazivUstanove=" + nazivUstanove + ", godinaUpisa=" + godinaUpisa + ", brojMesta="
				+ brojMesta + ", brojPrijavljenih=" + brojPrijavljenih +", odnos prijavljenih i mesta="+brojPrijavljenih/(double)brojMesta +"]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PrijemniIspit))
			return false;
		PrijemniIspit pi = (PrijemniIspit) obj;
		return this.nazivUstanove.equals(pi.getNazivUstanove()) && this.godinaUpisa == pi.getGodinaUpisa()
				&& this.brojMesta == pi.getBrojMesta() && this.brojPrijavljenih == pi.getBrojPrijavljenih();
	}

}
