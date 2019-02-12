package zadatak2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IOAnalizatorTeksta {

	public static String ucitaj(String fname) throws Exception {

		String s = "";

		try (FileReader fr = new FileReader(fname); BufferedReader br = new BufferedReader(fr)) {
			boolean kraj = false;
			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else
					s = s + pom + " ";
			}
		}
		return s;
	}

	public static void ucitajINapisiURedovima(String fname) {

		if (fname == null)
			throw new RuntimeException("Ime fajla ne moze da bude null!");

		try {
			String s = ucitaj(fname);
			String[] reci = s.split(" ");

			for (int i = 0; i < reci.length; i++) {
				for (int j = 0; j < reci[i].length(); j++) {
					System.out.println(reci[i].charAt(j) + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("GRESKA: " + e.getMessage());
		}
	}

	public static void ucitajI10MaxReciURedu(String fname) {

		if (fname == null)
			throw new RuntimeException("Naziv fajla ne moze biti null!");

		try {
			String s = ucitaj(fname);
			String[] reci = s.split(" ");

			for (int i = 0; i < reci.length; i++) {
				if ((i + 1) % 10 == 0)
					System.out.println(reci[i]);
				else
					System.out.print(reci[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public static void ucitajIMax5SlovaUReci(String fname) {

		if (fname == null)
			throw new RuntimeException("Ime fajla ne moze biti null");

		try {
			String s = ucitaj(fname);
			String[] reci = s.split(" ");

			for (int i = 0; i < reci.length; i++) {
				if (reci[i].length() >= 5) {
					System.out.println(reci[i] + " -> " + reci[i].substring(0, 5));
				} else {

					char slovo = reci[i].charAt(reci[i].length()-1);

					String pom = reci[i] + slovo + slovo + slovo + slovo + slovo;

					System.out.println(reci[i] + " -> " + pom.substring(0, 5));
				}
			}
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public static int brojJavljanjaReciUTekstu(String fname, String rec) {

		if (fname == null)
			throw new RuntimeException("Ime fajla ne moze biti null!");
		int broj = 0;
		String[] s = fname.split(" ");
		for (int i = 0; i < s.length; i++) {
			if (s[i].equalsIgnoreCase(rec) || s[i].equals(rec + "."))
				broj++;
		}
		return broj;
	}

	public static void ucitajIUpisi(String fname, String fname1) {

		if (fname == null)
			throw new RuntimeException("Ime fajla ne moze da bude null!");

		try (FileWriter fw = new FileWriter(fname1);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw)) {
			String s = ucitaj(fname);
			String[] reci = s.split(" ");
			for (int i = 0; i < reci.length; i++) {
				if (brojJavljanjaReciUTekstu(s, reci[i]) > 1)
					pw.print(reci[i] + " ");
			}

		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public static void izvestaj(String fname, String fname1) {

		try (FileWriter fw = new FileWriter(fname1);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw)) {

			String s = ucitaj(fname);
			String[] reci = s.split(" ");
			
			String najduzaRec = reci[0];
			String najkracaRec = reci[0];
			for (int i = 0; i < reci.length; i++) {
				if (reci[i].length() > najduzaRec.length())
					najduzaRec = reci[i];
				if (reci[i].length() < najkracaRec.length())
					najkracaRec = reci[i];
			}
			pw.print("Ukupan broj reci: " + reci.length + "\nNajduza rec: " + najduzaRec + "\nNajkraca rec: " + najkracaRec);

		} catch (Exception e) {
			System.out.println("GRESKA: " + e.getMessage());
		}

	}

}
