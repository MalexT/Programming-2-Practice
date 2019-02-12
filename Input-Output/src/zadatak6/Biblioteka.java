package zadatak6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Biblioteka {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	public void unosNoveKnjige() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			Knjiga k = new Knjiga();

			System.out.println("Unesite naslov knjige:");
			k.setNaslov(br.readLine());

			System.out.println("Unesite autora knjige: ");
			k.setAutor(br.readLine());

			System.out.println("Unesite ISBN: ");
			k.setISBN(br.readLine());

			if (knjige.contains(k))
				throw new RuntimeException("Knjiga vec postoji u biblioteci.");
			else
				knjige.add(k);

		} catch (IOException e) {
			System.out.println("Greska" + e.getMessage());
		}
	}

	public void unosViseKnjiga() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean dalje = false;

		while (!dalje) {
			unosNoveKnjige();
			try {
				System.out.println("Da li zelite da unesete jos jednu knjigu?");
				String s = br.readLine();
				if (!s.equalsIgnoreCase("da"))
				dalje = true;

			} catch (IOException e) {
				System.out.println("Greska" + e.getMessage());
			}
		}
	}

	public void ispisi() {

		if (knjige.size() == 0) {
			System.out.println("Biblioteka je prazna.");
		} else
			for (Knjiga knjiga : knjige) {
				System.out.println(knjiga);
			}
	}

}
