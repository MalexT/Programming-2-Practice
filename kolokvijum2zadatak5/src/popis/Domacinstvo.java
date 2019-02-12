package popis;


public class Domacinstvo {

	private String mesto;
	private int brojOdraslih;
	private int brojDece;
	private double mesecnaPrimanja;

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		if (mesto.equals(null) || mesto.length() < 5 || mesto.length() > 13) {
			throw new RuntimeException("Greska prilikom unosa mesta.");
		}
		this.mesto = mesto;
	}

	public int getBrojOdraslih() {
		return brojOdraslih;
	}

	public void setBrojOdraslih(int brojOdraslih) {
		if (brojOdraslih < 0)
			throw new RuntimeException("Broj odraslih je manji od 0");
		this.brojOdraslih = brojOdraslih;
	}

	public int getBrojDece() {
		return brojDece;
	}

	public void setBrojDece(int brojDece) {
		if (brojDece < 0)
			throw new RuntimeException("Broj dece u domacinstvu je manji od 0");
		this.brojDece = brojDece;
	}

	public double getMesecnaPrimanja() {
		return mesecnaPrimanja;
	}

	public void setMesecnaPrimanja(double mesecnaPrimanja) {
		if(mesecnaPrimanja<0)
			throw new RuntimeException("Mesecna primanja moraju biti iznad nule.");
		this.mesecnaPrimanja = mesecnaPrimanja;
	}

	@Override
	public String toString() {
		return "Domacinstvo [mesto=" + mesto + ",\tbrojOdraslih=" + brojOdraslih + ",\tbrojDece=" + brojDece
				+ ",\tmesecnaPrimanja=" + mesecnaPrimanja + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Domacinstvo)) {
			return false;
		}
		Domacinstvo other = (Domacinstvo) obj;
		if (brojDece != other.brojDece) {
			return false;
		}
		if (brojOdraslih != other.brojOdraslih) {
			return false;
		}
		if (Double.doubleToLongBits(mesecnaPrimanja) != Double.doubleToLongBits(other.mesecnaPrimanja)) {
			return false;
		}
		if (mesto == null) {
			if (other.mesto != null) {
				return false;
			}
		} else if (!mesto.equals(other.mesto)) {
			return false;
		}
		return true;
	}

}
