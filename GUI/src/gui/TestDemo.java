package gui;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.PrintWriter;

public class TestDemo {

	public String ucitajText() {

		try (FileReader fr = new FileReader("fajl.txt"); 
				BufferedReader br = new BufferedReader(fr)) {
			String tekst = null;
			while (true) {
				String s = br.readLine();

				if (s == null)
					break;

				s = tekst + s + '\n';
			}
			return tekst;

		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
			return null;
		}

	}

	public void upisFajl(String teskt) {

		try (FileWriter fw = new FileWriter("fajl.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw)) {
			pw.println(teskt);
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}

	}
}
