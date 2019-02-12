package zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UcitavanjeSaTastature {

	public static void brojRecenica() {

		Scanner s = new Scanner(System.in);

		try {
			String string = s.nextLine();
			int brojac = 0;
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == '.') {
					brojac++;
				}
			}
			System.out.println("broj recenica je: " + brojac);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void brojReciURecenici() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int brojac = 0;
			System.out.println("Text: ");
			String s = br.readLine();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ') {
					brojac++;
				}
			}
			System.out.println("Broj reci je: " + brojac);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void ucitaj() {

		Scanner in = new Scanner(System.in);

		try {
			String s = in.nextLine();
			String[] niz = s.split(" ");
			int brojac = 0;
			for (int i = 0; i < niz.length; i++) {
				if (niz[i].equalsIgnoreCase("sneg") || niz[i].equals("sneg.")) {
					brojac++;
				}
			}
			System.out.println("Broj pojavljivanja: " + brojac);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void metriUKm() {

		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Unesite metre: ");
			double m = in.nextDouble();
			double km = m / 1000;
			System.out.println("Uneto je x: " + m + "metara, a to je: " + km + "km");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void unos() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean kraj = false;
		double suma = 0;
		System.out.println("Unesite brojeve: ");
		while (!kraj) {
			try {
				String s = br.readLine();
				if (s.equals("kraj")) {
					kraj = true;
				} else
					suma = suma + Double.parseDouble(s);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Suma je: " + suma);
	}

	public static void faktorijel() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		try {
			int faktorijel = 1;
			s = br.readLine();
			int broj = Integer.parseInt(s);
			if (broj <= 0)
				System.out.println("1");
			else
				for (int i = broj; i > 0; i--) {
					faktorijel = faktorijel * i;
				}
			System.out.println("Faktorijel broja: " + broj + " je " + faktorijel);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void proizvod() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean kraj = false;
		double proizvod = 1;

		while (!kraj) {
			try {
				String s = br.readLine();
				if (s.equalsIgnoreCase("kraj")) {
					kraj = true;
				} else
					proizvod = proizvod * Double.parseDouble(s);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Proizvod je: " + proizvod);
	}
}
