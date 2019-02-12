package zadatak6.prijemni;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import zadatak6.prijemni.izuzeci.PrijemniException;

public class OrganizacijaPrijemnogIspita {

	private List<PrijemniIspit> ustanove = new LinkedList<>();

	public void ucitajIzFajla(String fname) {

		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fname)))) {

			while (true) {
				PrijemniIspit pi = (PrijemniIspit) ois.readObject();

				if (pi.getBrojPrijavljenih() > 0)
					ustanove.add(pi);
			}

		} catch (Exception e) {
			throw new PrijemniException("Greska: " + e.getMessage());
		}
	}

	public List<String> vratiUspesnePrijemneIspite() {
		List<String> uspeh = new LinkedList<>();

		for (PrijemniIspit prijemniIspit : ustanove) {

			if (prijemniIspit.getGodinaUpisa() == 2018) {

				for (PrijemniIspit prijemniIspit2 : ustanove) {

					if (prijemniIspit.getNazivUstanove().equals(prijemniIspit2.getNazivUstanove())) {
						if (prijemniIspit.getBrojPrijavljenih() > prijemniIspit2.getBrojPrijavljenih()
								&& prijemniIspit2.getGodinaUpisa() == 2017) {
							uspeh.add(prijemniIspit.getNazivUstanove());
						}
					}

				}

			}

		}

		return uspeh;
	}

}
