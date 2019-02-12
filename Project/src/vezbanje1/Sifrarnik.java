package vezbanje1;

public class Sifrarnik {

	static void ispis(int ocena) {
		switch (ocena) {
		case 1: System.out.println("nedovoljan");
		break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 3: 
			System.out.println("Dobar");
			break;
		case 4: 
			System.out.println("Vrlo Dobar");
			break;
		case 5: 
			System.out.println("Odlican");
			break;
		default:
			System.out.println("Greska");
		}
	}
	
	static String vratiString(int ocena) {
		switch (ocena) {
		case 5: 
			return "Odlican";
		case 4:
			return "Vrlo dobar";
		case 3: 
			return "Dobar";
		case 2: 
			return "Dovoljan";
		case 1: 
			return "Nedovoljan";
		default:
			return "Greska";
		}
	}
	
	static void ispisNaEkranu(char c) {
			switch (c) {
			case '!':
			case ',':
			case '.':
			case '?':
			case ';':
			case ':': System.out.println("Unet je znak interpunkcije");
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9': System.out.println("Uneti znak je cifra");
			break;
			}
		}
		
	
}
