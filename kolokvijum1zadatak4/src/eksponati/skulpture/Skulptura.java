package eksponati.skulpture;

import eksponati.Eksponat;

public class Skulptura extends Eksponat {

	private String materijal;

	public String getMaterijal() {
		return materijal;
	}

	public void setMaterijal(String materijal) {
		this.materijal = materijal;
	}
	@Override
	public String toString() {
		return super.toString()+ "MATERIJAL: " +this.materijal+ "NAPOMENA: u pitanju je skulptura";
	}
}
