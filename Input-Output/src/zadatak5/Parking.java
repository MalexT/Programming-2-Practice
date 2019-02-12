package zadatak5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parking {

	ParkingMesto[] mesta;
	
	public void kapacitet() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Unesite kapacitet parking mesta: ");
			String s;
			s = br.readLine();
			int b = Integer.parseInt(s);
			
			if(b<=0) mesta = new ParkingMesto[20];
			else
				mesta = new ParkingMesto[b];
		} catch (IOException e) {
			System.out.println("Greska "+e.getMessage());
			mesta = new ParkingMesto[20];
			
			e.printStackTrace();
		}
		for (int i = 0; i < mesta.length; i++) {
			mesta[i] = new ParkingMesto();
			mesta[i].setZauzetost(false);
		}
		
	}
	
	public void ispisi() {
		
		if(mesta==null)
			throw new RuntimeException("Nije inicijalizovan.");
		
		for (ParkingMesto parkingMesto : mesta) {
			System.out.println(parkingMesto);
		}
		
	}
	
	public void unesiElemente() {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		if (mesta == null )
			throw new RuntimeException("Nije inicijalizovan");
		for (int i = 0; i < mesta.length; i++) {
		try {
			System.out.println("Unesite podatke o parking mestu.");
			String s;
			s = br.readLine();
			if(s.equalsIgnoreCase("slobodno")) {
				mesta[i].setZauzetost(false);
				mesta[i].setRegigstarskiBroj(null);
			}
			else {
				mesta[i].setRegigstarskiBroj(s);
				mesta[i].setZauzetost(true);
			}
		} catch (IOException e) {
			System.out.println("Greska"+e.getMessage());
			e.printStackTrace();
		}
		}	
	}
	
	
}
