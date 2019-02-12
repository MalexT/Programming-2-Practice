package fon.ocene;

public class Ocena {

	private int vrednost;
	private String predmet;
	
	
	public int getVrednost() {
		return vrednost;
	}
	public void setVrednost(int vrednost) {
		if(vrednost<5 || vrednost > 10)
			System.out.println("GRESKA");
		this.vrednost = vrednost;
	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		if(predmet==null || predmet.length()==0)
			System.out.println("GRESKA");
		this.predmet = predmet;
	}
	
	
}
