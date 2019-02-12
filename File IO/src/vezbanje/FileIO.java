package vezbanje;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO {

	public static void ucitajIIspisi() {

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("tekst.txt"));

			boolean kraj = false;
			String s = "";

			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else
					s = s + pom + " ";
			}

			System.out.println(s);
		} catch (IOException e) {
			System.out.println("Greska " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void ucitajIIspisi2() {

		try (FileReader fr = new FileReader("tekst.txt"); BufferedReader br = new BufferedReader(fr)) {

			boolean kraj = false;
			String s = "";
			while (!kraj) {
				String pom = br.readLine();
				if (pom == null)
					kraj = true;
				else
					s = s + pom + " ";
			}
		} catch (FileNotFoundException e) {
			System.out.println("Greska fajl nije pronadjen" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Greska pri unosu " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void upisiStringove() {

		PrintWriter out = null;

		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter("tekst2.txt")));
			out.println("Danas je lep dan.");
			out.println("Mozda ce temperatura biti iznad nule.");
		} catch (IOException e) {
			System.out.println("Greska: " + e.getMessage());
		} finally {
			if (out != null)
				out.close();
		}
	}

	public static void upisiStringove2() {

		try(FileWriter fOut = new FileWriter("text2.txt");
			BufferedWriter bwOut = new BufferedWriter(fOut);
			PrintWriter pOut = new PrintWriter(bwOut);) {
			pOut.println("Danas je lep dan"	);
			pOut.println("Mozda ce temperatura biti iznad nule.");			
		} catch (Exception e) {
			System.out.println("Greska: "+e.getMessage());
		}
		
		
	}

}
