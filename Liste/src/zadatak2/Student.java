package zadatak2;

public class Student {

	private String brojIndeksa;
	private String ime;
	private String prezime;
	private int ocena;

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getOcena() {
		return ocena;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		if (brojIndeksa != null)
			this.brojIndeksa = brojIndeksa;
		else
			System.out.println("GRESKA a");
	}

	public void setIme(String ime) {
		if (ime != null)
			this.ime = ime;
		else
			System.out.println("GRESKA b ");
	} 

	public void setPrezime(String prezime) {
		if (prezime != null)
			this.prezime = prezime;
		else
			System.out.println("GRESKA c ");
	}

	public void setOcena(int ocena) {
		if (ocena >= 5 && ocena <= 10)
			this.ocena = ocena;
		else
			System.out.println("GRESKA b");
	}

	@Override
	public String toString() {
		return "Student [brojIndeksa=" + brojIndeksa + ", ime=" + ime + ", prezime=" + prezime + ", ocena=" + ocena
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return s.getBrojIndeksa().equals(this.brojIndeksa);
		}
		return false;
	}
}
