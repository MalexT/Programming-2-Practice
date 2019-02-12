package grad;

import java.io.Serializable;

import grad.exception.GradException;

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
		if (naziv == null || naziv.length() < 2)
			throw new GradException("Naziv grada ne sme biti manji od 2 slova i ne sme biti null");
		else
			this.naziv = naziv;
	}

	public void setBrojStanovnika(int brojStanovnika) {
		if (brojStanovnika <= 0)
			throw new GradException("Grad mora imati vise od 0 stanovnika.");
		else
			this.brojStanovnika = brojStanovnika;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Grad))
			throw new GradException("Element ne pripada Gradovima");
		Grad g = (Grad) obj;
		return this.naziv.equals(g.getNaziv());
	}

}
