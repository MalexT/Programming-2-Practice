package zadatak5.popis;

import java.io.Serializable;

import javax.management.RuntimeErrorException;

public class Domacinstvo implements Serializable {

	private String mesto;
	private int brojOdraslih;
	private int brojDece;
	private double mesecnaPrimanja;

	public String getMesto() {
		return mesto;
	}

	public int getBrojOdraslih() {
		return brojOdraslih;
	}

	public int getBrojDece() {
		return brojDece;
	}

	public double getMesecnaPrimanja() {
		return mesecnaPrimanja;
	}

	public void setMesto(String mesto) {
		if (mesto.length() < 5 || mesto == null || mesto.length() > 13)
			throw new RuntimeException("Mesto ne sme da bude krace od 5 slova");
		this.mesto = mesto;
	}

	public void setBrojOdraslih(int brojOdraslih) {
		if (brojOdraslih < 0)
			throw new RuntimeException("Ne sme biti negativan broj odraslih osoba");
		this.brojOdraslih = brojOdraslih;
	}

	public void setBrojDece(int brojDece) {
		if (brojDece < 0)
			throw new RuntimeException("Ne sme biti negativan broj dece.");
		this.brojDece = brojDece;
	}

	public void setMesecnaPrimanja(double mesecnaPrimanja) {
		if (mesecnaPrimanja < 0)
			throw new RuntimeException("Primanja moraju biti pozitivna vrednost.");
		this.mesecnaPrimanja = mesecnaPrimanja;
	}

	@Override
	public String toString() {
		return "Domacinstvo [mesto=" + mesto + "\t brojOdraslih=" + brojOdraslih + "\t brojDece=" + brojDece
				+ "\t mesecnaPrimanja=" + mesecnaPrimanja + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Domacinstvo))
			return false;
		Domacinstvo d = (Domacinstvo) obj;
		return this.mesto.equals(d.getMesto()) && this.brojOdraslih == d.getBrojOdraslih()
				&& this.brojDece == d.getBrojDece() && this.mesecnaPrimanja == d.getMesecnaPrimanja();
	}

}
