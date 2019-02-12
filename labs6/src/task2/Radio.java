package task2;

import task1.HomeAppliance;

public class Radio extends HomeAppliance {

	private double frequency;
	
	public Radio(boolean state, String name, double frequency){
	super(state, name);
	if(frequency>=87.5 && frequency<=107.9)
		this.frequency = frequency;
	else {
		System.out.println("ERROR");
		this.frequency = 87.5;
		}
	}
	
	public double getFrequency() {
		return this.frequency;
	}
	
	public void setFrequency(double frequency) {
		if(frequency>= 87.5 && frequency<=107.9)
			this.frequency = frequency;
		else
			System.out.println("ERROR");
	}
	
	@Override
	public String toString() {
		return super.toString() + " RADIO FREQUENCY: " + this.frequency + " Mhz";
	}
	
}
