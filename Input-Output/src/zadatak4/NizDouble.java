package zadatak4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NizDouble {

	private double[] niz;
	
	public void unosKapaciteta() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Unesite kapacitet niza: ");
			String s;
			s = br.readLine();
			int b = Integer.parseInt(s);
			if(b<=0)
				throw new RuntimeException("Nije unet odgovarajuci kapacitet.");
			else
				niz = new double[b];
			
		} catch (IOException e) {
			System.out.println("Greska "+ e.getMessage());
		}
	}
	
	
	public void unosElemenata() {
		
		if(niz == null)
			throw new RuntimeException("Niz nije inicijalizovan. ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " +(i+1)+ ". element.");
			
			String s;
			try {
				s = br.readLine();
				double broj = Double.parseDouble(s);
				niz[i]=broj;
			} catch (IOException e) {
				System.out.println("Greska"+e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	public double sumiranniz() {
		double suma = 0;
		
		if(niz==null)
			throw new RuntimeException("Niz nije inicijalizovan");
		
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}
		
		return suma;
	}
	
	
	
	
}
