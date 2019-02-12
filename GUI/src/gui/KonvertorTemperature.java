package gui;

public class KonvertorTemperature {

	public double konvertujCUF(double celzijus) {
		return ((celzijus*9.0)/5.0) +32;
	}
	
	public double konvertujFUC(double farenhajt) {
		return (farenhajt-32)*(5.0/9.0);
	}
}
