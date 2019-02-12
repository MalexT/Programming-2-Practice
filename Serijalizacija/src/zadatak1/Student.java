package zadatak1;

import java.io.Serializable;

public class Student implements Serializable {

	private String imePrezime;
	private int poeni;

	public String getImePrezime() {
		return imePrezime;
	}

	public int getPoeni() {
		return poeni;
	}

	public void setImePrezime(String imePrezime) {
		if (imePrezime != null)
			this.imePrezime = imePrezime;
		else
			throw new RuntimeException("Ime i prezime ne smeju da budu null");
	}

	public void setPoeni(int poeni) {
		if (poeni >= 0 && poeni <= 100)
			this.poeni = poeni;
		else
			throw new RuntimeException("Poeni moraju da budu u rasponu [0-100]!");
	}

	@Override
	public String toString() {
		return "Student [imePrezime: " + imePrezime + ", poeni=" + poeni + "]";
	}
}
