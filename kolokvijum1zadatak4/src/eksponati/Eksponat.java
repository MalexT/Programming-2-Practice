package eksponati;

import java.util.GregorianCalendar;

public class Eksponat {

	private String naziv;
	private String autor;
	private double cena;
	private GregorianCalendar datumPrijema;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null || naziv.equals(""))
			System.out.println("GRESKA");
		else
			this.naziv = naziv;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if(autor==null || autor.equals(""))
			System.out.println("GRESKA");
		else
			this.autor = autor;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		if(cena <=0)
			System.out.println("GRESKA");
		else
			this.cena = cena;
	}
	public GregorianCalendar getDatumPrijema() {
		return datumPrijema;
	}
	public void setDatumPrijema(GregorianCalendar datumPrijema) {
		if(datumPrijema==null || datumPrijema.after(new GregorianCalendar()))
			System.out.println("GRESKA");
		else
			this.datumPrijema = datumPrijema;
	}
	
	@Override
	public String toString() {
		return "NAZIV: " +this.naziv + " CENA: "+this.cena + " AUTOR: "+this.autor+ " DATUM PRIJEMA: "+this.datumPrijema;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null || !(o instanceof Eksponat))
			return false;
		
		Eksponat e = (Eksponat)(o);
		
		if(naziv.equals(e.naziv) && autor.equals(e.autor))
			return true;
		else 
			return false;
	}
}
