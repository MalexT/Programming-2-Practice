package prijemni;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import prijemni.izuzeci.PrijemniException;

public class OrganizacijaPrijemnogIspita {

	private List<PrijemniIspit> ustanove = new LinkedList<>();

	public void ucitajIzFajlaUListu(String fname) {

		try (FileInputStream fis = new FileInputStream(fname);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis)) {
			try {// da li treba try catch blok za while loop?
				while (true) {
					PrijemniIspit pi = (PrijemniIspit) ois.readObject();
					if (pi.getBrojPrijavljenih() > 0)
						ustanove.add(pi);
				}
			} catch (Exception e1) {
			}
		} catch (Exception e) {
			throw new PrijemniException("Greska prilikom unosa ustanova u listu.");
		}
	}

	public List<String> vratiUspesnePrijemneIspite() { // malo problematican!!!
		List<String> uspesniPrijemniIspiti = new LinkedList<>();
		for (PrijemniIspit prijemniIspit1 : ustanove) {
			if (prijemniIspit1.getGodinaUpisa() == 2017) {
				for (PrijemniIspit prijemniIspit2 : ustanove) {
					if (prijemniIspit2.getNazivUstanove().equals(prijemniIspit1.getNazivUstanove())
							&& prijemniIspit2.getGodinaUpisa() == 2018
							&& prijemniIspit2.getBrojPrijavljenih() > prijemniIspit1.getBrojPrijavljenih())
						uspesniPrijemniIspiti.add(prijemniIspit2.getNazivUstanove());
				}
			}
		}
		return uspesniPrijemniIspiti;
	}

}
