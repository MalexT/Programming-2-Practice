package task1;

	
public class HomeAppliance {

	private boolean turnedOn;
	
	private String brandAndModel;
	
	public HomeAppliance(boolean turnedOn, String brandAndModel) {
		this.turnedOn = turnedOn;
		this.brandAndModel = brandAndModel;
	}
	
	public void turnOnOrOff() {
		if(turnedOn == false) {
			turnedOn = true;
		}
		else {
			turnedOn = false;
		}
	}
	
	public void turnOnOrOff1() {
//		turnedOn != turnedOn;
	}
	
	@Override
	public String toString() {
		return "BRAND AND MODEL: " + brandAndModel + " TURNED ON: " + turnedOn;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HomeAppliance) {
			HomeAppliance ha = (HomeAppliance)obj;
			return ha.brandAndModel.equals(brandAndModel);
		}else {
			return false;
		}
	}
	
	
}
