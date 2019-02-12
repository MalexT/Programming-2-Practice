package zadatak1.festivali;

import java.io.Serializable;

import zadatak1.festivali.izuzeci.MuzickiFestivalException;

public class MuzickiFestival implements Serializable {

	private String naziv;
	private String mesto;
	private String pobednik;

	public String getNaziv() {
		return naziv;
	}

	public String getMesto() {
		return mesto;
	}

	public String getPobednik() {
		return pobednik;
	}

	public void setNaziv(String naziv) {
		if (naziv.equals("") || naziv == null)
			throw new MuzickiFestivalException("Naziv ne sme biti null ili prazan string");
		else
			this.naziv = naziv;
	}

	public void setMesto(String mesto) {
		if (mesto.equals("") || mesto == null)
			throw new MuzickiFestivalException("Mesto ne sme biti null ili prazan string");
		else
			this.mesto = mesto;
	}

	public void setPobednik(String pobednik) {
		if (pobednik.equals("") || pobednik == null)
			throw new MuzickiFestivalException("Pobednik mora da ima ime.");
		else
			this.pobednik = pobednik;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof MuzickiFestival))
			return false;
		MuzickiFestival mf = (MuzickiFestival)obj;
		
		return mf.getNaziv().equals(this.naziv) && mf.getMesto().equals(this.mesto);
	}
	
	
}
