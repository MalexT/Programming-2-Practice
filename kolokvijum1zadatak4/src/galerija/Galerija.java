package galerija;

import java.util.GregorianCalendar;

import eksponati.Eksponat;
import eksponati.skulpture.Skulptura;

public class Galerija {

	private Eksponat[] eksponati;
	
	public Galerija() {
		eksponati = new Eksponat[100];
	}
	
	public boolean postojiUNizu(Eksponat e) {
		for (int i = 0; i < eksponati.length; i++) {
			if(eksponati[i]!=null && eksponati[i].equals(e) )
				return true;
		}
		return false;
	}
	
	public void unesiEksponat(Eksponat e) {
		
		if(e==null || postojiUNizu(e) == true) {
			System.out.println("GRESKA");
			return;
		}
	
		for (int i = 0; i < eksponati.length; i++) 
			if(eksponati[i] == null) {
				eksponati[i] = e;
				return;
			}
		
		System.out.println("GRESKA");
	}
	
	public void uvediPopust(double popust) {
		
		GregorianCalendar tekucaGodina = new GregorianCalendar();
		int prethodnaGodina = tekucaGodina.get(GregorianCalendar.YEAR)-1;
	
		for (int i = 0; i < eksponati.length; i++) {
			if(eksponati[i]!=null && eksponati[i].getDatumPrijema().get(GregorianCalendar.YEAR)==prethodnaGodina) {
				double novaCena = eksponati[i].getCena() * (100-popust)/100;
				eksponati[i].setCena(novaCena);
			}
		}
	}
	
	public Skulptura[] vratiNajskuplje() {
		
		Skulptura[] s = new Skulptura[2];
		
		int max1 = -1;
		
		for (int i = 0; i < eksponati.length; i++) {
			if(eksponati[i] != null && eksponati[i] instanceof Skulptura && ((Skulptura)(eksponati[i])).getMaterijal().equals("bronza"))
				if(max1==-1 || eksponati[max1].getCena() < eksponati[i].getCena())
				max1 = i;
		}
		
		int max2 = -1;
		
		for (int j = 0; j < eksponati.length; j++) {
			if(j!=max1 && eksponati[j] instanceof Skulptura && ((Skulptura)(eksponati[j])).getMaterijal().equals("bronza"))
				if(max2 == -1 || eksponati[max2].getCena()< eksponati[j].getCena())
					max2 = j;
		}
		
		if(max1!=-1) s[0]=(Skulptura)eksponati[max1];
		if(max2!=-1) s[1]=(Skulptura)eksponati[max2];
		
		return s;
	}
}
