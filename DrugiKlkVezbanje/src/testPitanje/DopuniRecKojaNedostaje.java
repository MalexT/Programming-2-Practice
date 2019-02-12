package testPitanje;

public class DopuniRecKojaNedostaje implements TestPitanje {

	private String tacanOdgovor;

	public DopuniRecKojaNedostaje(String TO) {
		tacanOdgovor = TO;
	}

	@Override
	public boolean proveriTacnostOdgovora(String odgovor) {
		return odgovor.equalsIgnoreCase(tacanOdgovor);
	}

	@Override
	public void prikaziTacanOdgovor() {
		System.out.println("Tacan odgovor je: " + tacanOdgovor);
	}

}
