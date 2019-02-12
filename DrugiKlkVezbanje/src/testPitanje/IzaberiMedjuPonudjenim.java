package testPitanje;

public class IzaberiMedjuPonudjenim implements TestPitanje {

	private char tacnaOpcija;
	private String tacanPunOdgovor;

	public IzaberiMedjuPonudjenim(char a, String b) {
		this.tacnaOpcija = a;
		this.tacanPunOdgovor = b;
	}

	@Override
	public boolean proveriTacnostOdgovora(String odgovor) {
		return String.valueOf(tacnaOpcija).equals(odgovor);
	}

	@Override
	public void prikaziTacanOdgovor() {
		System.out.println(
				"Tacan odgovor je dat pod slovom (" + tacnaOpcija + ") " + "\n Njegov sadrzaj je: " + tacanPunOdgovor);
	}

}
