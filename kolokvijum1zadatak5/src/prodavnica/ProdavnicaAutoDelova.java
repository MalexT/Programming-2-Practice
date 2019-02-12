package prodavnica;

import prodavnica.gume.Guma;
import prodavnica.gume.VrstaGume;

public class ProdavnicaAutoDelova {

	private Guma[] ponudaGuma;
	
	public ProdavnicaAutoDelova() {
		ponudaGuma = new Guma[200];
	}
	
	public void pretrazi(VrstaGume vrsta, int sirina, int visina, int precnik) {
		int brojac=0;
		for (int i = 0; i < ponudaGuma.length; i++) 
			if(ponudaGuma[i]!=null && ponudaGuma[i].getVrstaGume()==vrsta && 
			ponudaGuma[i].getSirina()==sirina && 
			ponudaGuma[i].getVisina()==visina && 
			ponudaGuma[i].getPrecnik()==precnik) {
				System.out.println(ponudaGuma[i]);
				brojac++;
			}
		
		if(brojac==0) {
		System.out.println("NEMA");
		}
	}
	
	
	
	public boolean postojiUNizu(Guma g) {
		for (int i = 0; i < ponudaGuma.length; i++) {
			if(ponudaGuma[i]!=null &&  ponudaGuma[i].getMarka().equals(g.getMarka()) &&
					ponudaGuma[i].getVisina()==g.getVisina() && 
					ponudaGuma[i].getSirina()==g.getSirina() && 
					ponudaGuma[i].getPrecnik()==g.getPrecnik())
				return true;
		}
		return false;	
	}
	
	public void unesiGumu(Guma g) {
		int brojNovihGuma;
		for (int i = 0; i < ponudaGuma.length; i++) {
			if(ponudaGuma[i]!=null && ponudaGuma[i].getMarka().equals(g.getMarka()) && 
					ponudaGuma[i].getVisina()==g.getVisina() && 
					ponudaGuma[i].getSirina()==g.getSirina() && 
					ponudaGuma[i].getVrstaGume().equals(g.getVrstaGume()) && 
					ponudaGuma[i].getPrecnik()==g.getPrecnik()) {
					brojNovihGuma = ponudaGuma[i].getStanje()+g.getStanje();
				ponudaGuma[i].setStanje(brojNovihGuma);
			}
		}
		
		for (int i = 0; i < ponudaGuma.length; i++) {
			if(ponudaGuma[i]== null && g!=null && postojiUNizu(g)==false)
				ponudaGuma[i]=g;
		}
		
	}
	
	public Guma[] sastaviSpisakZaNabavku() {
		
		int brojac= 0;
		
		for (int i = 0; i < ponudaGuma.length; i++) {
			if(ponudaGuma[i]!= null && ponudaGuma[i].getStanje() <= 2)
				brojac++;
		}
		
		if (brojac == 0) return null;
		
		Guma[] spisak = new Guma[brojac];
		
		brojac = 0;
		
		for (int i = 0; i < ponudaGuma.length; i++) {
			if(ponudaGuma[i]!= null && ponudaGuma[i].getStanje() <= 2) {
			spisak[brojac] = ponudaGuma[i];
			brojac++;
			}
		}
		return spisak;
		
	}
	
		
}
