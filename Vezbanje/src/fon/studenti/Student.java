package fon.studenti;

import java.util.GregorianCalendar;

import fon.Smer;
import fon.ocene.Ocena;

public class Student {

	
	private String ime;
	private String prezime;
	private GregorianCalendar datumRodjenja;
	private Smer s;
	private Ocena[] ocene = new Ocena[100];
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if(ime == null || ime.equals("") || ime.length() < 3)
			System.out.println("GRESKA");
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		if(prezime == null || prezime.equals("") || prezime.length() < 3 || !(prezime.endsWith("ic")))
			System.out.println("GRESKA");
		this.prezime = prezime;
	}
	public GregorianCalendar getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(GregorianCalendar datumRodjenja) {
		if(datumRodjenja == null || datumRodjenja.after(new GregorianCalendar()))
				System.out.println("GRESKA");
		this.datumRodjenja = datumRodjenja;
	}
	public Smer getS() {
		return s;
	}
	public void setS(Smer s) {
		this.s = s;
	}
	public Ocena[] getOcene() {
		return ocene;
	}
	public void setOcene(Ocena[] ocene) {
		if(ocene==null)
			System.out.println("GRESKA");
		this.ocene = ocene;
	}
	
	@Override
	public String toString() {
		return "IME: " +this.ime +" PREZIME: "+this.prezime+ " DATUM RODJENJA: " + this.datumRodjenja +" SMER: "+this.s+" OCENE:"+ this.ocene;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		
		if (datumRodjenja == null) {
			if (other.datumRodjenja != null)
				return false;
		} else if (!datumRodjenja.equals(other.datumRodjenja))
			return false;
		
		
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		return true;
	}
	
	public double prosek() {
		int brojac = 0;
		int suma = 0;
		for (int i = 0; i < ocene.length; i++) {
				if(ocene[i].getVrednost()>5 ) {
					brojac++;
					suma+=ocene[i].getVrednost();
				}
		}
		return (double)suma/brojac;
	}
	
	
	
}
