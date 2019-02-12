package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TekstDemo {

	public String ucitajTekst(String nazivFajla) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(nazivFajla));
		boolean kraj = false;
		String tekst = "";
		
		while (!kraj) {
			String pom = in.readLine();
			if (pom == null)
				kraj = true;
			else
				tekst = tekst + pom + "\n";
		}
		in.close();
		return tekst;
	}

	public void upisiTekst(String nazivFajla, String tekst) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter(nazivFajla));
		out.write(tekst);
		out.close();
	}

}
