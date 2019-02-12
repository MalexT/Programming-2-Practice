package primeri;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Grupa {

	private LinkedList<Osoba> clanovi = new LinkedList<Osoba>();

	public void unosUListu(Osoba o) {
		clanovi.add(o);
	}

	public void serijalizacija() {

		try (FileOutputStream fos = new FileOutputStream("grupa.out");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			for (Osoba osoba : clanovi) {
				oos.writeObject(osoba);
			}
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public void deserijalizacija() {
		try (FileInputStream fis = new FileInputStream("grupa.out");
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis)) {
			clanovi.clear();

			try {
				while (true) {
					Osoba o = (Osoba) ois.readObject();
					clanovi.add(o);
				}
			} catch (EOFException e) {
			}
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public void ispis() {
		for (Osoba osoba : clanovi) {
			System.out.println(osoba);
		}
	}
}
