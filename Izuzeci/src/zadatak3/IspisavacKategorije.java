package zadatak3;

public class IspisavacKategorije {

	public static void proveraVisine(int visina) throws Exception {

		if (visina < 120 || visina > 250)
			throw new Exception("Visina je van granica.");

		if (visina < 160)
			System.out.println("Niski ljudi");
		if (visina >= 160 && visina < 185)
			System.out.println("Ljudi srednje visine.");
		if (visina >= 185)
			System.out.println("Visoki ljudi");

	}

	public static void godineCoveka(int godine) throws Exception {

		if (godine < 0 || godine > 125)
			throw new Exception("Godine nisu u okviru.");

		if (godine < 29)
			System.out.println("Mladost");
		if (godine >= 30 && godine < 55)
			System.out.println("Zrelost");
		if (godine >= 56)
			System.out.println("Startost");
	}
}
