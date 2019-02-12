package zadatak2;

public class TestVozila {

	public static void main(String[] args) {

		Automobil a = new Automobil();
		Avion av = new Avion();
		a.setMarka("Mercedes");
		a.setModel("E220");
		av.setMarka("Boeing");
		av.setModel("747");
		
		
		a.ispisi();
		av.ispisi();
	}

}
