package zadatak2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Biblioteka {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	public void unosKnjige1() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Knjiga k = new Knjiga();
			System.out.println("Unesite naziv knjige: ");
			k.setNaslov(br.readLine());
			System.out.println("Unesite ISBN knjige: ");
			k.setISBN(br.readLine());
			System.out.println("Unesite autora knjige");
			k.setAutor(br.readLine());

			if (knjige.contains(k))
				throw new RuntimeException("Knjiga vec postoji");

			knjige.add(k);
		} catch (IOException e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public void serijalizuj() {

		try (FileOutputStream fos = new FileOutputStream("biblioteka.out");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			for (Knjiga knjiga : knjige) {
				oos.writeObject(knjiga);
			}
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public void deserijalizuj() {
		try (FileInputStream fis = new FileInputStream("biblioteka.out");
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis)) {
			knjige.clear();

			try {
				while (true) {
					Knjiga k = (Knjiga) ois.readObject();
					knjige.add(k);
				}
			} catch (EOFException e) {
			}

		} catch (Exception e) {
			System.out.println("GRESKA: " + e.getMessage());
		}
	}

	public void ispisi() {
		if(knjige.isEmpty())
			System.out.println("Biblioteka je prazna.");
		for (Knjiga knjiga : knjige) {
			System.out.println(knjiga);
		}
	}
	
}
