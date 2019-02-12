package zadatak1.festivali;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ArhivaFestivala implements Arhiviranje{

	private List<MuzickiFestival> festivali = new LinkedList<>();
	
	public void upisiFestivaleUcesnika (String ime, String fname) throws Exception {
		
		if(festivali.isEmpty()) {
			throw new Exception("Lista je prazna.");
		}
		
		try(FileOutputStream fos = new FileOutputStream(fname);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
					ObjectOutputStream oos = new ObjectOutputStream(bos)){
			
			for (MuzickiFestival muzickiFestival : festivali) {
				if(muzickiFestival.getPobednik().equals(ime))
					oos.writeObject(muzickiFestival);
			}
		}catch (Exception e) {
			System.out.println("GRESKA "+e.getMessage());
		}	
	}

	@Override
	public void ucitajFestivaleIzFajla(String fname) {

		try(FileReader fr =  new FileReader(fname);
				BufferedReader br = new BufferedReader(fr)){
			
			while(true) {
				MuzickiFestival mf = new MuzickiFestival();
				String pom = br.readLine();
				if(pom==null)
					break;
				String[]elementi = pom.split("#");
				mf.setNaziv(elementi[0]);
				mf.setMesto(elementi[1]);
				mf.setPobednik(elementi[2]);
				festivali.add(mf);
			}
		}catch (Exception e) {
		}
	}

	@Override
	public void objediniArhive(List<String> lista, String odrediste) {
		
		List<MuzickiFestival>objedinjeno =  new LinkedList<>();
		
		for (String festival : lista) {
			try(FileInputStream fis = new FileInputStream(festival);
					BufferedInputStream bis = new BufferedInputStream(fis);
						ObjectInputStream ois = new ObjectInputStream(bis)){
				
				//ovde ima greska valjda
				while(true) {
				MuzickiFestival mf = new MuzickiFestival();
				mf = (MuzickiFestival)ois.readObject();
				
				if(!(objedinjeno.contains(mf)))
					objedinjeno.add(mf);
				}
			}catch(Exception e) {
				System.out.println("GRESKA"+e.getMessage());
			}
		}
		
		try (FileOutputStream fos = new FileOutputStream(odrediste);
				BufferedOutputStream bos =  new BufferedOutputStream(fos);
					ObjectOutputStream oos = new ObjectOutputStream(bos)){
				for (MuzickiFestival muzickiFestival : objedinjeno) {
					oos.writeObject(muzickiFestival);
				}
		}catch(Exception e1) {
			System.out.println("GRESKA "+e1.getMessage());
		}
	}
}
