package zadatak3;

public class Test {

	public static void main(String[] args) {

		BazaMotocikala bm = new BazaMotocikala();
		
		Motocikl m = new Motocikl();
		m.setMarka("Honda");
		m.setModel("R600x");
		m.setKubikaza(600);
		
		bm.unosUBazuM(m);
		bm.ispisi();
		bm.serijalizuj();
		bm.deserijalizuj();
		System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_\n");
		bm.ispisi();
		
		
	}

}
