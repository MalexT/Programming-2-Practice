package restoran.vrsta;

import java.util.GregorianCalendar;

public class Restoran {

	private String naziv;
	private VrstaHrane hrana;
	private int ocena;
	private GregorianCalendar datumProcene;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv != null && !(naziv.equals("")))
			this.naziv = naziv;
		else
			System.out.println("GRESKA");
	}

	public VrstaHrane getHrana() {
		return hrana;
	}

	public void setHrana(VrstaHrane hrana) {
		this.hrana = hrana;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		if (ocena < 1 || ocena > 5)
			System.out.println("GRESKA");
		else
			this.ocena = ocena;
	}

	public GregorianCalendar getDatumProcene() {
		return datumProcene;
	}

	public void setDatumProcene(GregorianCalendar datumProcene) {
		if (datumProcene != null)
			this.datumProcene = datumProcene;
		else
			System.out.println("GRESKA");
	}

	@Override
	public String toString() {
		return "NAZIV: " + this.naziv + "\nVRSTA HRANE: " + this.hrana + "\nOCENA: " + this.ocena + "\nDATUM PROCENE: "
				+ this.datumProcene.getTime();
	}
}
