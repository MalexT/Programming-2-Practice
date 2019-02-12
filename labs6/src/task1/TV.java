package task1;

public class TV extends HomeAppliance {
	
	private int program;
	
	public TV(boolean turnedOn, String brandAndModel, int channel) {
		super(turnedOn, brandAndModel);
		if(channel>40 || channel < 1) {
			System.out.println("ERROR");
			program = 1;
		}else {
			this.program = channel;
		}
	}
	
	public void changeProgram(int num) {
		if(num>=1 && num <40) 
			this.program = num;
		else
			System.out.println("ERROR");
	}
	
	@Override
	public String toString() {
		return super.toString() + "  PROGRAM: " + this.program;
	}
}
