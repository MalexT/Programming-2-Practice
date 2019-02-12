package zadatak4;

public class Proizvod {

	private int sifra;
	private String naziv;
	private int kolicina;

	public int getSifra() {
		return sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setSifra(int sifra) {
		if (sifra >= 0)
			this.sifra = sifra;
		else
			throw new RuntimeException("Greska uneta je nedozvoljena vrednost.");
	}

	public void setNaziv(String naziv) {
		if (naziv != null)
			this.naziv = naziv;
		else
			throw new RuntimeException("Greska uneta je nedozvoljena vrednost.");
	}

	public void setKolicina(int kolicina) {
		if (kolicina >= 0)
			this.kolicina = kolicina;
		else
			throw new RuntimeException("Greska uneta je nedozvoljena vrednost.");
	}

	@Override
	public String toString() {
		String a = (this.getSifra() + " " + this.getNaziv() + " " + this.getKolicina());
		return a.toUpperCase();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Proizvod))
			throw new RuntimeException("Greska!");
		Proizvod p = (Proizvod) obj;
		if (this.getSifra() == p.getSifra())
			return true;
		return false;
	}

}
