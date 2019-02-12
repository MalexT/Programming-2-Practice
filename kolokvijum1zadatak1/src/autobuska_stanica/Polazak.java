package autobuska_stanica;

import java.util.GregorianCalendar;

public class Polazak {

	private String destinacija;
	private GregorianCalendar vreme;
	private int brojSlobodnihMesta;
	
	
	public String getDestinacija() {
		return destinacija;
	}
	public void setDestinacija(String destinacija) {
		if(destinacija != null && destinacija!="")
		this.destinacija = destinacija;
		else
			System.out.println("GRESKA");
	}
	public GregorianCalendar getVreme() {
		return vreme;
	}
		
	public void setVreme(GregorianCalendar vreme) {
		if(vreme==null || vreme.before(new GregorianCalendar()))
			System.out.println("Greska");	
		else 
			this.vreme = vreme;
	}
	
	public int getBrojSlobodnihMesta() {
		return brojSlobodnihMesta;
	}
	public void setBrojSlobodnihMesta(int brojSlobodnihMesta) {
		if(brojSlobodnihMesta>=0)
		this.brojSlobodnihMesta = brojSlobodnihMesta;
		else
			System.out.println("GRESKA");
	}
	
	@Override
	public String toString() {
		return "DESTINACIJA:" +this.destinacija + " VREME: " +this.vreme + " BROJ MESTA: " +this.brojSlobodnihMesta ;
	}
	
}
