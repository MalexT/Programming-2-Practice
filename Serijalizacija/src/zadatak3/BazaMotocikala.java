package zadatak3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import org.ietf.jgss.Oid;

public class BazaMotocikala {

	private LinkedList<Motocikl> motocikli;
	
	public BazaMotocikala() {
	motocikli = new LinkedList<Motocikl>();
	}
	
	public void unosUBazuM(Motocikl m) {
		
		if(m!=null && (!(motocikli.contains(m))))
			motocikli.add(m);
		else
			throw new RuntimeException("Greska vec postoji takav motocikl u bazi podataka ili je motocikl null");
	}
	
	public void serijalizuj() {
		
		try(FileOutputStream fos =  new FileOutputStream("motocikli.out");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
					ObjectOutputStream oos = new ObjectOutputStream(bos)){
			for (Motocikl motocikl : motocikli) {
				oos.writeObject(motocikl);
			}
		}catch(Exception e) {
			System.out.println("GRESKA "+e.getMessage());
		}
	}
	
	public void ispisi() {
		for (Motocikl motocikl : motocikli) {
			System.out.println(motocikl);
		}
	}
	
	public void deserijalizuj() {
		try( FileInputStream fis = new FileInputStream("motocikli.out");
				BufferedInputStream bis = new BufferedInputStream(fis);
					ObjectInputStream ois = new ObjectInputStream(bis)){
			motocikli.clear();
			
			try {
				while(true) {
					Motocikl m = (Motocikl)ois.readObject();
					motocikli.add(m);
				}
			}catch(EOFException e) {}
			
		}catch(Exception e) {
			System.out.println("GRESKA: "+e.getMessage());
		}
	}
	
}
