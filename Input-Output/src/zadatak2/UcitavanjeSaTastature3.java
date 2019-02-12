package zadatak2;

import java.util.Scanner;

public class UcitavanjeSaTastature3 {

	public static void unost() {
		
		Scanner in = new Scanner(System.in);
		
		try {
			String s = in.nextLine();
			int brojac= 0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)== '.') {
					brojac++;
				}
			}
			System.out.println("Ima " +brojac+ " recenica");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void brReciURecenici() {
		
		Scanner in = new Scanner(System.in);
		try {
			String recenica = in.nextLine();
			String[] reci = recenica.split(" ");
			System.out.println("Broj reci u recenici je "+reci.length);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public static void brReci() {
		
		Scanner in = new Scanner(System.in);
		
		try {
			String s = in.nextLine();
			int brojac=0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)==' ') {
					brojac++;
				}
			}
			System.out.println("Broj reci u recenici je: " +brojac);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
}
