package zadatak3.vaterpolo;

import zadatak3.vaterpolo.exception.VaterpoloException;

public class Vaterpolista {

	private String imePrezime;
	private String klub;
	private int poeni;

	public String getImePrezime() {
		return imePrezime;
	}

	public String getKlub() {
		return klub;
	}

	public int getPoeni() {
		return poeni;
	}

	public void setImePrezime(String imePrezime) {
		if (imePrezime.isEmpty() || imePrezime == null) {
			throw new VaterpoloException("Ime i prezime ne smeju biti null ili prazni.");
		} else
			this.imePrezime = imePrezime;
	}

	public void setKlub(String klub) {
		if (klub.isEmpty() || klub == null)
			throw new VaterpoloException("Klub ne sme biti prazan string a ni null vrednost");
		else
			this.klub = klub;
	}

	public void setPoeni(int poeni) {
		if (poeni < 0)
			throw new VaterpoloException("Broj poena mora biti 0 ili veci od 0");
		else
			this.poeni = poeni;
	}

	@Override
	public String toString() {
		return "Vaterpolista [imePrezime=" + imePrezime + ", klub=" + klub + ", poeni=" + poeni + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Vaterpolista))
			throw new VaterpoloException("GRESKA, nije tipa vaterpolista");
		Vaterpolista v = (Vaterpolista) obj;

		return this.imePrezime.equals(v.getImePrezime()) && this.klub.equals(v.getKlub());
	}

}
