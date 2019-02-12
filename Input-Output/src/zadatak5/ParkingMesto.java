package zadatak5;

public class ParkingMesto {

	private boolean zauzetost;
	private String regigstarskiBroj;

	public boolean isZauzetost() {
		return zauzetost;
	}

	public String getRegigstarskiBroj() {
		return regigstarskiBroj;
	}

	public void setZauzetost(boolean zauzetost) {
		this.zauzetost = zauzetost;
	}

	public void setRegigstarskiBroj(String regigstarskiBroj) {
		this.regigstarskiBroj = regigstarskiBroj;
	}

	@Override
	public String toString() {
		if(zauzetost)
		return "ParkingMesto [regigstarskiBroj=" + this.regigstarskiBroj+"]";
		else
			return "Slobodno";
	}
	
	
	
}
