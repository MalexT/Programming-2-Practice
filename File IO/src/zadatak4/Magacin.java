package zadatak4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;

public class Magacin {

	private LinkedList<Proizvod> proizvodi;

	public Magacin() {
		proizvodi = new LinkedList<Proizvod>();
	}

	public void unosUListu() {

		try (FileReader fr = new FileReader("proizvodi.txt"); BufferedReader br = new BufferedReader(fr)) {
			boolean kraj = false;
			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else {
					Proizvod p = new Proizvod();
					p.setSifra(Integer.parseInt((pom.substring(0, pom.indexOf(' ')))));
					p.setNaziv(pom.substring(pom.indexOf(' ') + 1, pom.lastIndexOf(' ')));
					p.setKolicina(Integer.parseInt(pom.substring(pom.lastIndexOf(' ') + 1)));
					if (!(proizvodi.contains(p)))
						proizvodi.add(p);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void ispisi() {
		for (Proizvod proizvod : proizvodi) {
			System.out.println(proizvod);
		}
	}

	public void nabavka() {

		try (FileWriter fw = new FileWriter("nabavka.txt"); PrintWriter pw = new PrintWriter(fw)) {
			pw.println("Potrebno je nabaviti sledece proizvode: ");

			int rbr = 1;
			for (int i = 0; i < proizvodi.size(); i++) {
				if (proizvodi.get(i).getKolicina() < 5)
					pw.println((rbr + ") " + proizvodi.get(i)));
				rbr++;
			}
		} catch (Exception e) {
			System.out.println("Greska " + e.getMessage());
		}
	}

	public void dopuna() {

		try (FileReader fr = new FileReader("dopuna.txt"); BufferedReader br = new BufferedReader(fr)) {

			boolean kraj = false;
			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else {
					Proizvod p = new Proizvod();
					int sifra = Integer.parseInt(pom.substring(0, pom.indexOf(' ')));
					String naziv = (pom.substring(pom.indexOf(' ') + 1, pom.lastIndexOf(' ')));
					int kolicina = Integer.parseInt(pom.substring(pom.lastIndexOf(' ') + 1));

					p.setKolicina(kolicina);
					p.setNaziv(naziv);
					p.setSifra(sifra);
					if (proizvodi.contains(p)) {
						Proizvod stariProizvod = proizvodi.get(proizvodi.indexOf(p));
						stariProizvod.setKolicina(stariProizvod.getKolicina() + p.getKolicina());
					} else
						proizvodi.add(p);
				}
			}

		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

}
