package zadatak6;

public class Knjiga {

	private String naslov;
	private String ISBN;
	private String autor;

	public String getNaslov() {
		return naslov;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getAutor() {
		return autor;
	}

	public void setNaslov(String naslov) {
		if (naslov != null)
			this.naslov = naslov;
		else
			throw new RuntimeException("Greska");
	}

	public void setISBN(String ISBN) {
		if (ISBN != null)
			this.ISBN = ISBN;
		else
			throw new RuntimeException("Greska");
	}

	public void setAutor(String autor) {
		if (autor != null)
			this.autor = autor;
		else
			throw new RuntimeException("Greska");
	}

	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", ISBN=" + ISBN + ", autor=" + autor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Knjiga))
			throw new RuntimeException("Morate uneti objekat klase knjiga.");
		if (((Knjiga) obj).getISBN().equals(this.ISBN)) {
			return true;
		}
		return false;
	}

}
