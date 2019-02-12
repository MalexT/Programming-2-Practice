package prodavnica.gume;

public class Guma {

	private String marka;
	private VrstaGume vrstaGume;
	private int sirina;
	private int visina;
	private int precnik;
	private int stanje;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		if (marka != null && !(marka.equals("")))
			this.marka = marka;
		else
			System.out.println("GRESKA");
	}

	public VrstaGume getVrstaGume() {
		return vrstaGume;
	}

	public void setVrstaGume(VrstaGume vrstaGume) {
		this.vrstaGume = vrstaGume;
	}

	public int getSirina() {
		return sirina;
	}

	public void setSirina(int sirina) {
		if (sirina >= 135 && sirina <= 265)
			this.sirina = sirina;
		else
			System.out.println("GRESKA");
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		if (visina >= 45 && visina <= 85)
			this.visina = visina;
		else
			System.out.println("GRESKA");
	}

	public int getPrecnik() {
		return precnik;
	}

	public void setPrecnik(int precnik) {
		if (precnik >= 13 && precnik <= 19)
			this.precnik = precnik;
		else
			System.out.println("GRESKA");
	}

	public int getStanje() {
		return stanje;
	}

	public void setStanje(int stanje) {
		if (stanje >= 0)
			this.stanje = stanje;
		else
			System.out.println("GRESKA");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Guma)) {
			return false;
		}
		Guma other = (Guma) obj;
		if (marka == null) {
			if (other.marka != null) {
				return false;
			}
		} else if (!marka.equals(other.marka)) {
			return false;
		}
		if (precnik != other.precnik) {
			return false;
		}
		if (sirina != other.sirina) {
			return false;
		}
		if (visina != other.visina) {
			return false;
		}
		if (vrstaGume != other.vrstaGume) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "MARKA: " + this.marka + " VRSTA: " + this.vrstaGume + "\nSIRINA: " + this.sirina + " VISINA: "
				+ this.visina + " PRECNIK: " + this.precnik + "\nSTANJE: " + this.stanje;
	}

}
