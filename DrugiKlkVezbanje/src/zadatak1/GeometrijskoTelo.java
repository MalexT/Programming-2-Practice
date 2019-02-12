package zadatak1;

public abstract class GeometrijskoTelo {

	public double povrsina;
	public double zapremina;
	public abstract void izracunajPovrsinu();
	public abstract void izracunajZapreminu();
	
	public double getPovrsina() {
		izracunajPovrsinu();
		return povrsina;
	}
	public double getZapremina() {
		izracunajZapreminu();
		return zapremina;
	}
	

}
