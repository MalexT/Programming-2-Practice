package zadatak2.autobuska_stanica;

import java.util.GregorianCalendar;

import javax.management.RuntimeErrorException;

public class Polazak {

	private String destinacija;
	private int brojSlobodnihMesta;
	private GregorianCalendar vreme;

	public String getDestinacija() {
		return destinacija;
	}

	public int getBrojSlobodnihMesta() {
		return brojSlobodnihMesta;
	}


	public void setDestinacija(String destinacija) {
		if (destinacija.isEmpty() || destinacija == null) {
			throw new RuntimeException("Destinacija ne sme biti prazna");
		} else
			this.destinacija = destinacija;
	}

	public void setBrojSlobodnihMesta(int brojSlobodnihMesta) {
		if (brojSlobodnihMesta <= 0)
			throw new RuntimeException("Greska, ne sme biti negativan broj slobodnih mesta.");
		this.brojSlobodnihMesta = brojSlobodnihMesta;
	}

	public GregorianCalendar getVreme() {
		return vreme;
	}

	public void setVreme(GregorianCalendar vreme) {
		if (vreme.before(new GregorianCalendar()) || vreme==null)
			throw new RuntimeException("Greska datum mora posle sadasnjeg");
		this.vreme = vreme;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Polazak))
			return false;
		Polazak p = (Polazak) obj;
		return this.destinacija.equals(p.getDestinacija()) && this.vreme.equals(p.vreme);
	}
}
