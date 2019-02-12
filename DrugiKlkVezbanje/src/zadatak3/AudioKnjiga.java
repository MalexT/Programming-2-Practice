package zadatak3;

public class AudioKnjiga extends Knjiga {

	@Override
	public double odrediCenu(double cena) {
		return cena + getBrojStrana()*500;
	}

}
