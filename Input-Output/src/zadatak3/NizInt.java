package zadatak3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.RuntimeErrorException;

public class NizInt {

	private int[] niz;
	
	public void unesiKapacitet() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Unesite kapacitet niza: ");
			String s = br.readLine();
			int broj = Integer.parseInt(s);
			if(broj<=0) {
				niz = new int[10];
			}
			else
				niz = new int[broj];
		} catch (IOException e) {
			System.out.println("Greska pri unosu kapaciteta: "+e.getMessage());
			niz = new int[10];
		}
	}
	
	public void unosElemenata() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		if(niz==null) throw new RuntimeException("Niz nije inicijalizovan.");
		
		for (int i = 0; i < niz.length; i++) {
			
			try {
				System.out.println("Unesite "+(i+1)+". element: ");
				String s = br.readLine();
				int broj = Integer.parseInt(s);
				niz[i]= broj;
			} catch (IOException e) {
				System.out.println("Greska "+e.getMessage());
			}
			
		}
	}
	
	public void ispisi() {
		
		if(niz==null) throw new RuntimeException("Niz nije inicijalizovan");
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println((i+1) + ". element niza je: " + niz[i]);
		}
	}
	
	
	
}
