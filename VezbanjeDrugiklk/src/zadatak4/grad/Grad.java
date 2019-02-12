package zadatak4.grad;

import java.io.Serializable;

import zadatak4.grad.exception.GradException;

public class Grad implements Serializable {

	private String naziv = "nepoznat";
	private int brojStanovnika = 0;

	public String getNaziv() {
		return naziv;
	}

	public int getBrojStanovnika() {
		return brojStanovnika;
	}

	public void setNaziv(String naziv) {
		if (naziv.length() < 2 || naziv == null)
			throw new GradException("Naziv grada ne sme biti kraci od 2 slova");
		else
			this.naziv = naziv;
	}

	public void setBrojStanovnika(int brojStanovnika) {
		if (brojStanovnika < 0)
			throw new GradException("Grad mora da ima vise od 0 stanovnika");
		else
			this.brojStanovnika = brojStanovnika;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Grad))
			throw new GradException("Objekat nije tipa grad");

		Grad g = (Grad) obj;
		return this.naziv.equals(g.getNaziv());

	}

}
