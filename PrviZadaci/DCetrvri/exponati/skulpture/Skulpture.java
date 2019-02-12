package exponati.skulpture;

import exponati.Exponat;

public class Skulpture extends Exponat {

	private String materijal;

	public String getMaterijal() {
		return materijal;
	}

	public void setMaterijal(String materijal) {
		this.materijal = materijal;
	}
	
	@Override
	public String toString() {
		return super.toString() + "SKULPTURA";
	}
}
