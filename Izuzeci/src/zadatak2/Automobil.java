package zadatak2;

public class Automobil {

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
		if (marka == null)
			throw new RuntimeException("Marka ne sme da bude null");
		this.marka = marka;
	}

	public void setModel(String model) {
		if (model == null)
			throw new RuntimeException("Model ne sme da bude null");
		this.model = model;
	}

	public void setKubikaza(int kubikaza) {
		if (kubikaza < 500 || kubikaza > 8000)
			throw new RuntimeException("Kubikaza nije u odgovarajucem domenu.");
		this.kubikaza = kubikaza;
	}

	@Override
	public String toString() {
		return "Automobil [marka=" + marka + ", model=" + model + ", kubikaza=" + kubikaza + "]";
	}
}
