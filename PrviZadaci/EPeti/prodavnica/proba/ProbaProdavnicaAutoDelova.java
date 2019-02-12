package prodavnica.proba;

import prodavnica.ProdavnicaAutoDelova;
import prodavnica.gume.Guma;
import prodavnica.gume.VrstaGume;

public class ProbaProdavnicaAutoDelova {

	public static void main(String[] args) {

		ProdavnicaAutoDelova p = new ProdavnicaAutoDelova();

		Guma g1 = new Guma();
		Guma g2 = new Guma();
		Guma g3 = new Guma();
		Guma g4 = new Guma();

		g1.setMarka("Kleber");
		g1.setSirina(195);
		g1.setVisina(65);
		g1.setPrecnik(15);
		g1.setStanje(10);
		g1.setVrstaGume(VrstaGume.ZIMSKA);

		g2.setMarka("Hankok");
		g2.setSirina(165);
		g2.setVisina(65);
		g2.setPrecnik(14);
		g2.setStanje(20);
		g2.setVrstaGume(VrstaGume.LETNJA);

		g3.setMarka("Goodyear");
		g3.setSirina(185);
		g3.setVisina(60);
		g3.setPrecnik(15);
		g3.setStanje(2);
		g3.setVrstaGume(VrstaGume.SVE_SEZONE);

		g4.setMarka("Goodyear");
		g4.setSirina(185);
		g4.setVisina(60);
		g4.setPrecnik(15);
		g4.setStanje(8);
		g4.setVrstaGume(VrstaGume.SVE_SEZONE);

		p.unesiGumu(g1);
		p.unesiGumu(g2);
		p.unesiGumu(g3);
		p.unesiGumu(g4);
		p.pretrazi(VrstaGume.ZIMSKA, 195, 65, 15);

		System.out.println();
		System.out.println();
		System.out.println();
		Guma[] novi = p.sastaviSpisakZaNabavku();
		if (novi != null) {
			for (int i = 0; i < novi.length; i++) {
				System.out.println(novi[i]);
			}
		}

		p.ispisi();

	}

}
