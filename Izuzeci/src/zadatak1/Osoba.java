package zadatak1;


public class Osoba {

	private String ime;
	private String prezime;
	private int visina;
	private double tezina;
	private int godine;

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getVisina() {
		return visina;
	}

	public double getTezina() {
		return tezina;
	}

	public int getGodine() {
		return godine;
	}

	public void setIme(String ime) {
		if (ime == null)
			throw new RuntimeException("Ime ne sme da bude null");
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		if (prezime == null)
			throw new RuntimeException("Prezime ne sme da bude null.");
		this.prezime = prezime;
	}

	public void setVisina(int visina) {
		if (visina < 50 || visina > 250)
			throw new RuntimeException("Nije odgovarajuca visina.");
		this.visina = visina;
	}

	public void setTezina(double tezina) {
		if (tezina < 2 || tezina > 250)
			throw new RuntimeException("Tezina nije u odgovarajucim granicama. ");
		this.tezina = tezina;
	}

	public void setGodine(int godine) {
		if (godine < 0 || godine > 125)
			throw new RuntimeException("Starost nije u odgovarajucem okviru. ");
		this.godine = godine;
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", visina=" + visina + ", tezina=" + tezina + ", godine="
				+ godine + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Osoba))
			throw new RuntimeException("Objekat nije klase osoba.");
		Osoba o = (Osoba) obj;

		if (this.ime.equals(o.getIme()) && this.prezime.equals(o.getPrezime()))
			return true;

		return false;
	}
}
