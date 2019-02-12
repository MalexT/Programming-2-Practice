package zadatak1;

public class Kvadar extends GeometrijskoTelo {

	private double duzina;
	private double sirina;
	private double visina;

	public double getDuzina() {
		return duzina;
	}

	public double getSirina() {
		return sirina;
	}

	public double getVisina() {
		return visina;
	}

	public void setDuzina(double duzina) {
		if (duzina > 0)
			this.duzina = duzina;
		else
			System.out.println("Greska");
	}

	public void setSirina(double sirina) {
		if (sirina > 0)
			this.sirina = sirina;
		else
			System.out.println("Greska");
	}

	public void setVisina(double visina) {
		if (visina > 0)
			this.visina = visina;
		else
			System.out.println("Greska");
	}

	@Override
	public void izracunajPovrsinu() {
		povrsina = 2 * duzina * sirina + 2 * duzina * visina + 2 * sirina * visina;
	}

	@Override
	public void izracunajZapreminu() {
		zapremina = duzina * visina * sirina;
	}

}
