package primeri;

public class Osobaa {

	private String ime;
	private String prezime;
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setIme(String ime) {
		if(ime!=null)
		this.ime = ime;
		else
			throw new RuntimeException("Ime ne sme da bude null.");
	}
	public void setPrezime(String prezime) {
		if(prezime!=null)
		this.prezime = prezime;
		else
			throw new RuntimeException("Prezime ne sme da bude null.");
	}
	
}
