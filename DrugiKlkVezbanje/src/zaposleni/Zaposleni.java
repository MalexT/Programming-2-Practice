package zaposleni;

public abstract class Zaposleni {

	protected double plata;
	private String imePrezime;
	public double getPlata() {
		return plata;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	public abstract void izracunajPlatu(double brojSati);
	
}
