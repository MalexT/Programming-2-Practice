package zadatak3;

public class InteraktivnaEKnjiga extends Knjiga {

	private int brojAnimacija;

	public int getBrojAnimacija() {
		return brojAnimacija;
	}

	public void setBrojAnimacija(int brojAnimacija) {
		this.brojAnimacija = brojAnimacija;
	}

	@Override
	public double odrediCenu(double cena) {
		return cena = cena + getBrojStrana()*200 + getBrojAnimacija()*250;
	}
}
