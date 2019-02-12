package zadatak1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class IspitniRok {

	public void serijalizacija(Student s, String fname) throws Exception {

		try (FileOutputStream fos = new FileOutputStream(fname);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			oos.writeObject(s);
		}
	}

	public void unosPodataka(String fnamea) {

		try {
			Scanner in = new Scanner(System.in);
			Student s = new Student();
			System.out.println("Unesite ime i prezime studenta: ");
			s.setImePrezime(in.nextLine());
			System.out.println("Unesite broj poena koje je ostvario student: ");
			s.setPoeni(in.nextInt());
			serijalizacija(s, fnamea);
		} catch (Exception e) {
			System.out.println("Greska " + e.getMessage());
		}
	}

	public Student deserijalizacija(String fname) throws Exception {

		try (FileInputStream fis = new FileInputStream(fname);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis)) {
			return (Student) ois.readObject();
		}
	}

	public void ucitajIzfajla(String fname1, String fname2) {

		try {
			Student s = deserijalizacija(fname1);
			System.out.println(s);
			Student st = deserijalizacija(fname2);
			System.out.println(st);
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
	}

	public void prosek(String fname, String f1name) {

		try {
			Student s = deserijalizacija(fname);
			Student s1 = deserijalizacija(f1name);

			double prosek = (s.getPoeni() + s1.getPoeni()) / 2;
			System.out.println("Prosecan broj poena je: " + prosek);

		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}

	}

}
