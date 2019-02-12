package zadatak5.popis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import zadatak5.popis.izuzeci.StatistikaException;

public class PopisDomacinstva {

	private List<Domacinstvo>domacinstva;
	public PopisDomacinstva() {
		domacinstva = new LinkedList<>();
	}
	
	public void upisiDomacinstvaBezPrimanja() throws StatistikaException {
		
		if(domacinstva.isEmpty())
			throw new StatistikaException("Lista je prazna");
		
		try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("domacinstva_bez_prihoda.txt")))){
			
			
			for (Domacinstvo domacinstvo : domacinstva) {
				pw.println(domacinstvo.getMesto()+ "#"+ domacinstvo.getBrojOdraslih()+ "#" + domacinstvo.getBrojDece());
			}
			
		}catch(Exception e) {
			System.out.println("GRESKA "+e.getMessage());
		}
	}
	
	public void statistikaDomacinstva() {
		try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("izvestaj.txt")))){
			int brojClanovaDomacinstva = 0;
			int brojDomacinstava = 0;
			int brojOdraslih = 0;
			int brojDece= 0;
			double mesecnaPrimanja = 0;
			for (Domacinstvo domacinstvo : domacinstva) {
				brojClanovaDomacinstva+= domacinstvo.getBrojDece()+domacinstvo.getBrojOdraslih();
				brojClanovaDomacinstva++;
				brojOdraslih+= domacinstvo.getBrojOdraslih();
				brojDece += domacinstvo.getBrojDece();
				mesecnaPrimanja+=domacinstvo.getMesecnaPrimanja();
			}
			pw.println("Broj domacinstava: "+ brojDomacinstava);
			pw.println("Prosecna mesecna primanja: "+mesecnaPrimanja/brojDomacinstava);
			pw.println("Prosecan broj odraslih osoba po domacinstvu: "+ brojOdraslih/(double)brojDomacinstava);
			pw.println("Prosecan broj dece po domacinstvu: " + brojDece/(double)brojDomacinstava);
			pw.println("Prosecna primanja po clanu domacinstva: " +mesecnaPrimanja/brojClanovaDomacinstva);
		}catch (Exception e) {
			System.out.println("GRESKA "+e.getMessage());
		}
	}
	
	
	public void ucitajDomacinstvaSaTastature() {
		
		System.out.println("Unesite broj domacinstava: ");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int brojDomacinstava = Integer.parseInt(br.readLine());
			for (int i = 0; i < brojDomacinstava; i++) {
				Domacinstvo d = new Domacinstvo();
				System.out.println("Unesite mesto domacinstva:");
				String mesto = br.readLine();
				d.setMesto(mesto);
				
				System.out.println("Unesite broj odraslih clanova domacinstva");
				int odrasli = Integer.parseInt(br.readLine());
				d.setBrojOdraslih(odrasli);
				
				System.out.println("Unesite broj dece.");
				int deca = Integer.parseInt(br.readLine());
				d.setBrojDece(deca);
				
				System.out.println("Unesite mesecna primanja domacinstva.");
				double primanja = Double.parseDouble(br.readLine());
				d.setMesecnaPrimanja(primanja);
				
				domacinstva.add(d);
			}
		}catch (Exception e) {
			System.out.println("Greska "+e.getMessage());
			try{Domacinstvo d = new Domacinstvo();
			System.out.println("Unesite mesto domacinstva:");
			String mesto = br.readLine();
			d.setMesto(mesto);
			System.out.println("Unesite broj odraslih clanova domacinstva");
			int odrasli = Integer.parseInt(br.readLine());
			d.setBrojOdraslih(odrasli);
			System.out.println("Unesite broj dece.");
			int deca = Integer.parseInt(br.readLine());
			d.setBrojDece(deca);
			System.out.println("Unesite mesecna primanja domacinstva.");
			double primanja = Double.parseDouble(br.readLine());
			d.setMesecnaPrimanja(primanja);
			domacinstva.add(d);
			}catch (Exception e1) {
			}
		}
	}
	
}
