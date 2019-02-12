package prijemni;

import java.io.Serializable;

import prijemni.izuzeci.PrijemniException;

public class PrijemniIspit implements Serializable {

	private String nazivUstanove;
	private int godinaUpisa; // mozda moze int ili GregorianCalendar
	private int brojmesta;
	private int brojPrijavljenih;

	public String getNazivUstanove() {
		return nazivUstanove;
	}

	public int getGodinaUpisa() {
		return godinaUpisa;
	}

	public int getBrojmesta() {
		return brojmesta;
	}

	public int getBrojPrijavljenih() {
		return brojPrijavljenih;
	}

	public void setNazivUstanove(String nazivUstanove) {
		if (nazivUstanove == null || nazivUstanove.length() < 5)
			throw new PrijemniException("Naziv ustanove ne sme biti kraci od 5 slova");
		this.nazivUstanove = nazivUstanove;
	}

	public void setGodinaUpisa(int godinaUpisa) {
		if (godinaUpisa < 0)
			throw new PrijemniException("Godina ne sme biti broj manji od 0");
		this.godinaUpisa = godinaUpisa;
	}

	public void setBrojmesta(int brojmesta) {
		if (brojmesta < 0)
			throw new PrijemniException("Broj mesta ne sme biti manji od 0");
		this.brojmesta = brojmesta;
	}

	public void setBrojPrijavljenih(int brojPrijavljenih) {
		if (brojPrijavljenih < 0)
			throw new PrijemniException("Broj prijavljenih ne sme biti manji od 0");
		this.brojPrijavljenih = brojPrijavljenih;
	}

	@Override
	public String toString() {
		return "PrijemniIspit [nazivUstanove=" + nazivUstanove + ", godinaUpisa=" + godinaUpisa + ", brojmesta="
				+ brojmesta + ", brojPrijavljenih=" + brojPrijavljenih
				+ ", relativni odnos(prijavljenih i broja mesta)=" + (brojPrijavljenih / (double) brojmesta) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PrijemniIspit))
			return false;
		PrijemniIspit pi = (PrijemniIspit) obj;
		return this.nazivUstanove.equals(pi.getNazivUstanove()) && this.godinaUpisa == pi.getGodinaUpisa()
				&& this.brojmesta == pi.getBrojmesta() && this.brojPrijavljenih == pi.getBrojPrijavljenih();
	}

}
