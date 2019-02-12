package zadatak1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IORadSaTekstom {

	public static void ucitaj() {

		try (FileReader fr = new FileReader("tekst.txt"); BufferedReader br = new BufferedReader(fr)) {

			boolean kraj = false;
			String s = "";
			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else
					s = pom + " ";
			}
			System.out.println(s);

		} catch (FileNotFoundException e) {
			System.out.println("Greska fajl nije pronadjen." + e.getMessage());
		} catch (IOException e) {
			System.out.println("Greska " + e.getMessage());
		}
	}

	public static void ucitajFajl(String fname) {

		if (fname == null)
			throw new RuntimeException("Unet je null");

		try (FileReader fr = new FileReader(fname); BufferedReader br = new BufferedReader(fr)) {

			String s = "";
			boolean kraj = false;

			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else
					s = s + pom + " ";
			}
			System.out.println(s);
		} catch (FileNotFoundException e) {
			System.out.println("Greska " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Greska " + e.getMessage());
		}
	}

	public static void brojReci(String fname) {

		if (fname == null)
			throw new RuntimeException("Unet je null");

		try (FileReader fr = new FileReader(fname); BufferedReader br = new BufferedReader(fr)) {

			boolean kraj = false;
			String s = "";

			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else
					s = s + pom + " ";
			}
			int brojac = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ') {
					brojac++;
				}
			}
			System.out.println("Broj reci u fajlu je: " + brojac);
		} catch (FileNotFoundException e) {
			System.out.println("Greska " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Greska " + e.getMessage());
		}
	}

	public static boolean recUTekstu(String rec) {

		try (FileReader fr = new FileReader("tekst2.txt"); BufferedReader br = new BufferedReader(fr)) {

			boolean kraj = false;
			String s = "";

			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else
					s = s + pom + " ";
			}

			String[] reci = s.split(" ");
			for (int i = 0; i < reci.length; i++)
				if (reci[i].equalsIgnoreCase(rec) || reci[i].equals(rec + "."))
					return true;
			return false;

		} catch (FileNotFoundException e) {
			System.out.println("GRESKA " + e.getMessage());
			return false;
		} catch (IOException e) {
			System.out.println("GRESKA " + e.getMessage());
			return false;
		}
	}

	public static void UcitajIVratiBrojRecenicaUTekstu() {

		try (FileReader fr = new FileReader("tekst3.txt"); BufferedReader br = new BufferedReader(fr)) {

			boolean kraj = false;
			String s = "";

			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else
					s = s + pom + " ";
			}
			int brojac = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?')
					brojac++;
			}
			System.out.println("Broj recenica u tekstu je: " + brojac);
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public static void unosReciUFajl(String upisati) {

		try (FileWriter fw = new FileWriter("tekst4.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {

			out.print(upisati);
		} catch (Exception e) {
			System.out.println("GRESKA"+e.getMessage());
		}
	}
	
	

}
