package autobuska_stanica;

import java.util.GregorianCalendar;

import javax.management.RuntimeErrorException;

public class Polazak {

	private String destinacija;
	private GregorianCalendar vreme;
	private int brojSlobodnihMesta;
	
	
	
	public String getDestinacija() {
		return destinacija;
	}
	public GregorianCalendar getVreme() {
		return vreme;
	}
	public int getBrojSlobodnihMesta() {
		return brojSlobodnihMesta;
	}
	public void setDestinacija(String destinacija) {
		if(destinacija==null || destinacija.isEmpty()) {
			throw new RuntimeException("Desstinacija ne sme biti prazan string a ni null.");
		} else {
			this.destinacija = destinacija;
		}
	}
	public void setVreme(GregorianCalendar vreme) {
		if((vreme==null)||vreme.before(new GregorianCalendar()))
			throw new RuntimeException("VREME ne sme biti period u proslosti");
		else
		this.vreme = vreme;
	}
	public void setBrojSlobodnihMesta(int brojSlobodnihMesta) {
		if(brojSlobodnihMesta<=0)
			throw new RuntimeException("Broj slobodnih mesta ne sme biti manji od nule.");
		else
			this.brojSlobodnihMesta = brojSlobodnihMesta;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(!(obj instanceof Polazak))
			return false;
		Polazak p = (Polazak)obj;
		if(p.getVreme().equals(this.vreme) && p.getDestinacija().equals(this.destinacija))
			return true;
		return false;
			
	}
	
	
	
}
