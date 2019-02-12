package zadatak2;

public abstract class Vozilo {

	private String marka;
	private String model;

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public void setMarka(String marka) {
		if (marka != null)
			this.marka = marka;
		else
			System.out.println("GRESKA");
	}

	public void setModel(String model) {
		if (model != null)
			this.model = model;
		else
			System.out.println("GRESKA");
	}
	
	public abstract boolean daLiIdePoKopnu();
	public abstract boolean daLiIdePoVodi();
	public abstract boolean daLiIdePoVazduhu();
	
	public void ispisi() {
		System.out.println("Marka vozila: "+this.getMarka());
		System.out.println("Model vozila: "+this.getModel());
		System.out.println("-------");
		if(daLiIdePoKopnu())
			System.out.println("Kopneno");
		if(daLiIdePoVazduhu())
			System.out.println("Vazdusno");
		if(daLiIdePoVodi())
			System.out.println("Vodeno");
	}
}
