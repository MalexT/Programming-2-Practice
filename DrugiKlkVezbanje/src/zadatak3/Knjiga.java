package zadatak3;

abstract public class Knjiga {

	private String naziv;
	private int brojStrana;
	public String getNaziv() {
		return naziv;
	}
	public int getBrojStrana() {
		return brojStrana;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}
	
	public abstract double odrediCenu (double cena);
}
