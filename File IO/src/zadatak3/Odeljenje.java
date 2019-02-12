package zadatak3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class Odeljenje {

	private List<Djak> djaci = new LinkedList<Djak>();

	public void ucitajIzFajla(String fname) {

		if (fname == null)
			throw new RuntimeException("Ime fajla ne moze da bude null");

		try (FileReader fr = new FileReader(fname); BufferedReader br = new BufferedReader(fr)) {
			boolean kraj = false;
			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else {
					Djak d = new Djak();
					String ime = pom.substring(0, pom.indexOf(' '));
					String prezime = pom.substring(pom.indexOf(' ') + 1, pom.lastIndexOf(' '));
					int ocena = Integer.parseInt(pom.substring(pom.lastIndexOf(' ') + 1));
					d.setName(ime);
					d.setSurname(prezime);
					d.setGrade(ocena);
					if (!djaci.contains(d))
						djaci.add(d);
				}
			}

		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public void odlicniDjaci() {

		try (FileWriter fw = new FileWriter("Odlicni_djaci.txt"); PrintWriter pw = new PrintWriter(fw)) {
			for (Djak djak : djaci) {
				if (djak.getGrade() == 5)
					pw.println(djak);
			}
		} catch (Exception e) {
			System.out.println("Greska " + e.getMessage());
		}
	}

	public void losiDjaci() {

		try (FileWriter fw = new FileWriter("Losi_djaci.txt"); PrintWriter pw = new PrintWriter(fw)) {
			for (int i = 0; i < djaci.size(); i++) {
				if (djaci.get(i).getGrade() == 1 || djaci.get(i).getGrade() == 2)
					pw.println(djaci.get(i));
			}
		} catch (Exception e) {
			System.out.println("Greska " + e.getMessage());
		}
	}

	public void ispisi() {
		for (Djak djak : djaci) {
			System.out.println(djak);
		}
	}
}
