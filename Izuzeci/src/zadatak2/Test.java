package zadatak2;

public class Test {

	public static void main(String[] args) {

		Automobil a = new Automobil();
		
		
		try {
		a.setMarka("Dodge");
		} catch(Exception e) {
			System.out.println("GRESKA "+e.getMessage());
		}
		
		try {
		a.setModel(null);
		} catch(Exception e) {
			System.out.println("GRESKA "+e.getMessage());
		}
		
		try {
			a.setKubikaza(7900);
		}catch(Exception e) {
			System.out.println("GRESKA "+e.getMessage());
		}
		
		System.out.println(a);
	}

}
