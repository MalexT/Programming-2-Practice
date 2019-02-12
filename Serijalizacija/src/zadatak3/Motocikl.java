package zadatak3;

import java.io.Serializable;

public class Motocikl implements Serializable{

	private String marka;
	private String model;
	private int kubikaza;

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setMarka(String marka) {
		if (marka != null)
			this.marka = marka;
		else
			throw new RuntimeException("GRESKA (null marka)");
	}

	public void setModel(String model) {
		if (model != null)
			this.model = model;
		else
			throw new RuntimeException("GRESKA (null model)");
	}

	public void setKubikaza(int kubikaza) {
		if (kubikaza > 0)
			this.kubikaza = kubikaza;
		else
			throw new RuntimeException("GRESKA (kubikaza je manja od 0)");
	}

	@Override
	public String toString() {
		return "Motocikl [marka: " + marka + ", model: " + model + ", kubikaza= " + kubikaza + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Motocikl))
			throw new RuntimeException("Greska objekat nije instanca klase Motocikl.");
		Motocikl m = (Motocikl) obj;
		if (marka.equals(m.getMarka()) && model.equals(m.getModel()) && kubikaza == m.getKubikaza())
			return true;
		else
			return false;
	}

}
