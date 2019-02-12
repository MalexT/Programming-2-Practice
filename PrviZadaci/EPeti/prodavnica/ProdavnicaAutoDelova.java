package prodavnica;

import prodavnica.gume.Guma;
import prodavnica.gume.VrstaGume;

public class ProdavnicaAutoDelova {

	private Guma[] ponudaGuma;

	public ProdavnicaAutoDelova() {
		ponudaGuma = new Guma[200];
	}

	public void pretrazi(VrstaGume v, int sirina, int visina, int precnik) {

		for (int i = 0; i < ponudaGuma.length; i++) {
			if (ponudaGuma[i] != null && ponudaGuma[i].getVrstaGume().equals(v) && ponudaGuma[i].getSirina() == sirina
					&& ponudaGuma[i].getVisina() == visina && ponudaGuma[i].getPrecnik() == precnik) {
				System.out.println(ponudaGuma[i]);
				return;
			}
		}
		System.out.println("NEMA");
	}

	public void unesiGumu(Guma g) {
		for (int i = 0; i < ponudaGuma.length; i++) {
			if (ponudaGuma[i] != null && ponudaGuma[i].equals(g)) {
				ponudaGuma[i].setStanje(ponudaGuma[i].getStanje() + g.getStanje());
				return;
			}
			if (ponudaGuma[i] == null && g != null) {
				ponudaGuma[i] = g;
				return;
			}
		}
	}

	public Guma[] sastaviSpisakZaNabavku() {

		int brojac = 0;
		for (int i = 0; i < ponudaGuma.length; i++) {
			if (ponudaGuma[i] != null && ponudaGuma[i].getStanje() <= 2) {
				brojac++;
			}
		}
		if (brojac == 0)
			return null;
		Guma[] gu = new Guma[brojac];

		brojac = 0;

		for (int i = 0; i < ponudaGuma.length; i++) {
			if (ponudaGuma[i] != null && ponudaGuma[i].getStanje() <= 2) {
				gu[brojac] = ponudaGuma[i];
				brojac++;
			}
		}
		return gu;
	}

	public void ispisi() {
		for (int i = 0; i < ponudaGuma.length; i++) {
			if (ponudaGuma[i] != null) {
				System.out.println(ponudaGuma[i]);
				System.out.println("=============");
			}
		}
	}

}
