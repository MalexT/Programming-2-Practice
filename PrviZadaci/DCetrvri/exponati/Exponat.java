package exponati;

import java.util.GregorianCalendar;

public class Exponat {

	private String autor;
	private double cena;
	private GregorianCalendar datumPrijema;
	private String naziv;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor != null && !(autor.equals("")))
			this.autor = autor;
		else
			System.out.println("GRESKA");
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		if (cena > 0)
			this.cena = cena;
		else
			System.out.println("GRESKA");
	}

	public GregorianCalendar getDatumPrijema() {
		return datumPrijema;
	}

	public void setDatumPrijema(GregorianCalendar datumPrijema) {
		if (datumPrijema != null && datumPrijema.before(new GregorianCalendar()))
			this.datumPrijema = datumPrijema;
		else
			System.out.println("GRESKA");
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv != null && !(naziv.equals("")))
			this.naziv = naziv;
		else
			System.out.println("GRESKA");
	}

	@Override
	public String toString() {
		return "NAZIV: " + this.naziv + " AUTOR: " + this.autor + " DATUM: " + this.datumPrijema.getTime() + " CENA: "
				+ this.cena;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Exponat) {
			Exponat e = (Exponat) obj;
			if(e.getAutor().equals(this.autor) && e.getNaziv().equals(this.naziv))
				return true;				
		}
			return false;
	}
	
	
}
