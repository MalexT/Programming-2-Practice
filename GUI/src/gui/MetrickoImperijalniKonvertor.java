package gui;

public class MetrickoImperijalniKonvertor {

	public double konvertujKmUMi(double kilometri) {
		return kilometri / 1.67;
	}
	
	public double konvertujMiUKm(double milje) {
		return milje*1.67;
	}
	
	public double konvertujMUSt(double metri) {
		return metri/0.32;
	}
	public double konvertujStUM(double stope) {
		return stope*0.32;
	}
	public double konvertujKgULb(double kg) {
		return kg/0.45;	
	}
	public double konvertujLbUKg(double lb) {
		return lb * 0.45;
	}
}
