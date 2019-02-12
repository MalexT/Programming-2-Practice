package popis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import popis.izuzeci.StatistikaException;

public class PopisDomacinstava {

	private List<Domacinstvo> domacinstva;

	public PopisDomacinstava() {
		domacinstva = new LinkedList<>();
	}

	public void upisiDomacinstvaBezPrimanja() throws StatistikaException {
		if (domacinstva.isEmpty()) {
			throw new StatistikaException("Lista je prazna.");
		}

		try (FileWriter fw = new FileWriter("domacinstva_bez_prihoda.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw)) {

			for (Domacinstvo domacinstvo : domacinstva) {
				if (domacinstvo.getMesecnaPrimanja() == 0) {
					pw.print(domacinstvo.getMesto());
					pw.print("#");
					pw.print(domacinstvo.getBrojOdraslih());
					pw.print("#");
					pw.print(domacinstvo.getBrojDece());
					pw.println();
				}
			}
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public void statistikaDomacinstava() {

		try (FileWriter fw = new FileWriter("izvestaj.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw)) {
			int brojDomacinstava = 0;
			int brojOdraslih = 0;
			int brojDece = 0;
			int clanoviPorodice = 0;
			double mesecnaPrimanja = 0;
			for (int i = 0; i < domacinstva.size(); i++) {
				brojDomacinstava++;
//				brojClanovaDomacinstva = domacinstva.get(i).getBrojDece() + domacinstva.get(i).getBrojOdraslih();
				brojOdraslih += domacinstva.get(i).getBrojOdraslih();
				brojDece += domacinstva.get(i).getBrojDece();
				mesecnaPrimanja += domacinstva.get(i).getMesecnaPrimanja();
			}
			clanoviPorodice = brojDece + brojOdraslih;
			pw.println(brojDomacinstava);
			pw.println(mesecnaPrimanja / (double) brojDomacinstava);
			pw.println(brojOdraslih / (double) brojDomacinstava);
			pw.println(brojDece / (double) brojDomacinstava);
			pw.println(mesecnaPrimanja / (double) clanoviPorodice);

		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public void unesiDomacinstva() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Koliko domacinstava zelite da unesete: ");
			int brojDomacinstava = Integer.parseInt(br.readLine());

			for (int i = 0; i < brojDomacinstava; i++) {
				try {
					Domacinstvo d = new Domacinstvo();

					System.out.println("Unesite naziv domacinstva: ");
					String s = br.readLine();
					System.out.println("Unesite broj odraslih osoba u domacinstvu: ");
					int odrasli = Integer.parseInt(br.readLine());
					System.out.println("Unesite broj dece u domacinstvu: ");
					int deca = Integer.parseInt(br.readLine());
					System.out.println("Unesite Mesecna primanja za domacinstvo: ");
					double primanja = Double.parseDouble(br.readLine());

					d.setBrojDece(deca);
					d.setBrojOdraslih(odrasli);
					d.setMesto(s);
					d.setMesecnaPrimanja(primanja);

					domacinstva.add(d);
					System.out.flush();
					

				} catch (Exception e) {
					System.out.println("Greska " + e.getMessage());

					Domacinstvo d = new Domacinstvo();

					System.out.println("Unesite naziv domacinstva: ");
					String s = br.readLine();
					System.out.println("Unesite broj odraslih osoba u domacinstvu: ");
					int odrasli = Integer.parseInt(br.readLine());
					System.out.println("Unesite broj dece u domacinstvu: ");
					int deca = Integer.parseInt(br.readLine());
					System.out.println("Unesite Mesecna primanja za domacinstvo: ");
					double primanja = Double.parseDouble(br.readLine());

					d.setBrojDece(deca);
					d.setBrojOdraslih(odrasli);
					d.setMesto(s);
					d.setMesecnaPrimanja(primanja);

					domacinstva.add(d);
				}
			}
		} catch (Exception e1) {
			System.out.println("GRESKA " + e1.getMessage());

		}
	}

}
