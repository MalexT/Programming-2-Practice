package zadatak3.vaterpolo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class VaterpoloUtakmica {

	private List<Vaterpolista>vaterpolisti = new LinkedList<>();
	
	public void napraviIzvestaj() {
		
		try(FileWriter fw = new FileWriter("izvestaj.txt");
				BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw)){
			for (Vaterpolista vaterpolista : vaterpolisti) {
				if(vaterpolista.getPoeni()>=2) {
				pw.print(vaterpolista.getImePrezime());
				pw.print("#");
				pw.print(vaterpolista.getKlub());
				pw.print("#");
				pw.print(vaterpolista.getPoeni());
				pw.println();
				}
			}
		}catch(Exception e) {
			System.out.println("GRESKA "+e.getMessage());
		}
	}
	
	public void dodajVaterpolistu(String imeprezime, String klub, int brojPoena) {
		Vaterpolista v = new Vaterpolista();
		v.setImePrezime(imeprezime);
		v.setKlub(klub);
		v.setPoeni(brojPoena);
		if(!vaterpolisti.contains(v)) {
			vaterpolisti.add(v);
		}else {
		try(FileWriter fw = new FileWriter("greske.txt");
				BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw)){
			pw.print(v);
			pw.println("Vec postoji u listi");
		}catch(Exception e)	{
		System.out.println("GRESKA "+e.getMessage());	
		}
	}
}		
	public void unesiVaterpolisteSaTastature() {
		
		try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			for (int i = 0; i < 22; i++) {
				try {
				System.out.println("Unesite ime i prezime vaterpoliste: ");
				String s = br.readLine();
				System.out.println("Unesite klub za koji igra: ");
				String klub = br.readLine();
				System.out.println("Unesite koliko je poena postignuo.");
				int poeni = Integer.parseInt(br.readLine());
				
				Vaterpolista v = new Vaterpolista();
				v.setImePrezime(s);
				v.setKlub(klub);
				v.setPoeni(poeni);
				vaterpolisti.add(v);
				}
				catch(Exception e1) {
				}
			}
		}catch(Exception e) {
			System.out.println("GRESKA "+e.getMessage());
		}
	}
	
}
