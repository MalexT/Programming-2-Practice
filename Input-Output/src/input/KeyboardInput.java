package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class KeyboardInput {

	public static void keyboardInput() {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesite poruku: ");
			String s = b.readLine();
			System.out.println("Uneto: " +s);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void realNumber() {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.println("Unesite broj: ");
			String s = b.readLine();
			double broj = Double.parseDouble(s);
			System.out.println("Kvadrat unetog broja je: "+ broj*broj);
		} catch (IOException e) {
			System.out.println("Greska: " + e.getMessage());
		}
	}
	
	public static void parity() {
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.println("Unesite broj: ");
			String s = b.readLine();
			
			int broj = Integer.parseInt(s);
			if(broj%2==0) {
				System.out.println("Jeste paran!");
			}else
				System.out.println("Nije paran");
		} catch (IOException e) {
			System.out.println("Greska "+ e.getMessage());
		}
	}
	
	public static void string() {
		
		Scanner s = new Scanner(System.in);
		
		String st;
		try {
			System.out.println("Unesite broj: ");
			st = s.nextLine();
			System.out.println("Uneli ste: "+st);
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}		
	}
	
	public static void realNumb() {
		
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Unesite kvadrat: ");
			double broj = in.nextDouble();
			System.out.println("Kvadrat broja je: " + broj*broj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void parityV2() {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Unesite broj za proveru: ");
			int broj = scan.nextInt();
			if(broj%2==0)
				System.out.println("Jeste paran!");
			else
				System.out.println("Nije paran!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}