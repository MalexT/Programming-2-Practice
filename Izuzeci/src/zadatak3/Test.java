package zadatak3;

public class Test {

	public static void main(String[] args) {

		try {
			IspisavacKategorije.proveraVisine(-189);
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}

		try {
			IspisavacKategorije.godineCoveka(19);
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
			e.printStackTrace();
		}

	}

}
