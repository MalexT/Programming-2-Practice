package zadatak2;

import java.io.Serializable;

public class Knjiga implements Serializable {

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
			throw new RuntimeException("GRESKA, null!");
	}

	public void setISBN(String iSBN) {
		if (iSBN != null)
			ISBN = iSBN;
		else
			throw new RuntimeException("GRESKA, null!");
	}

	public void setAutor(String autor) {
		if (autor != null)
			this.autor = autor;
		else
			throw new RuntimeException("GRESKA, null!");
	}

	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", ISBN=" + ISBN + ", autor=" + autor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Knjiga))
			throw new RuntimeException("GRESKA");
		Knjiga k = (Knjiga) obj;
		if (k.getISBN().equals(ISBN)) {
			return true;
		} else
			return false;
	}
}
