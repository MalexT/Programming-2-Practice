package testPitanje;

public class TestStranogJezika {

	private TestPitanje[] pitanja;
	
	public TestStranogJezika(int brojPitanja) {
		pitanja = new TestPitanje[brojPitanja];
	}
	public void dodajNovoPitanje(TestPitanje p) {
		for (int i = 0; i < pitanja.length; i++) {
			if(pitanja[i]==null) {
				pitanja[i]= p;
				return;
			}
		}
		System.out.println("Niz je pun");
	}
	
	public int[] tacnostOdgovora(String[] odgovori) {
		int[] niz;
		int brojac=0;
		for (int i = 0; i < pitanja.length; i++) {
			if(pitanja[i]!=null && pitanja[i].proveriTacnostOdgovora(odgovori[i])) {
				brojac++;
			}
		}
		niz = new int[brojac];
		int j = 0;
		for (int i = 0; i < pitanja.length; i++) {
			if(pitanja[i]!=null && !pitanja[i].proveriTacnostOdgovora(odgovori[i]) && i<brojac) {
				niz[j++] = i;
			}
		}
		
		return niz;
	}
	
	
	
}
