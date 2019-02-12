package zadatak4;

public class Racun {

	private int broj;
	private String proizvod;
	private double iznos;

	public int getRacun() {
		return broj;
	}

	public String getProizvod() {
		return proizvod;
	}

	public double getIznos() {
		return iznos;
	}

	public void setBroj(int racun) {
		if (racun < 0)
			throw new RacunException("Racun ne sme da bude manji od nule");
		this.broj = racun;
	}

	public void setProizvod(String proizvod) {
		if (proizvod == null)
			throw new RacunException("Proizvod ne sme da bude null");
		this.proizvod = proizvod;
	}

	public void setIznos(double iznos) {
		if (iznos < 0)
			throw new RacunException("Iznos ne sme da bude manji od nule");
		this.iznos = iznos;
	}

	@Override
	public String toString() {
		return "Racun [racun=" + broj + ", proizvod=" + proizvod + ", iznos=" + iznos + "]";
	}

}
