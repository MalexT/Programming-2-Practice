package zadatak5;

public class Proizvod {

	private int sifra;
	private String naziv;
	private double cena;

	public int getSifra() {
		return sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setSifra(int sifra) throws ProizvodException {
		if (sifra < 0)
			throw new ProizvodException("Sifra ne sme da bude manja od nule");
		this.sifra = sifra;
	}

	public void setNaziv(String naziv) throws ProizvodException {
		if (naziv == null)
			throw new ProizvodException("Naziv ne sme da bude null");
		this.naziv = naziv;
	}

	public void setCena(double cena) throws ProizvodException {
		if (cena < 0)
			throw new ProizvodException("Cena ne sme da bude manja od nule");
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Proizvod [sifra=" + sifra + ", naziv=" + naziv + ", cena=" + cena + "]";
	}

}
