package zadatak1;

public class ClanKomosije {

	private String imePrezime;
	private String funkcija = null;
	public String getImePrezime() {
		return imePrezime;
	}
	public String getFunkcija() {
		return funkcija;
	}
	public void setImePrezime(String imePrezime) {
		if(imePrezime !=null && imePrezime !="")
		this.imePrezime = imePrezime;
		else
			throw new RuntimeException("Greska ime i/ili prezime ne sme biti null a ni prazan string");
	}
	public void setFunkcija(String funkcija) {
		this.funkcija = funkcija;
	}
	
	@Override
	public String toString() {
		if(this.funkcija==null)
			return "Ime i prezime: "+this.imePrezime;
		else
			return "Ime i prezime: "+this.imePrezime+" Funkcija: "+this.funkcija;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClanKomosije) {
			ClanKomosije ck = (ClanKomosije)obj;	
			return imePrezime.equals(ck.getImePrezime());
		}
		return false;
	}
	
}
