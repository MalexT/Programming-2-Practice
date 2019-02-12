package task2;

public class TestRadio {

	public static void main(String[] args) {
		
		Radio r = new Radio(true, "whatEver", 90.1);
		
		System.out.println(r);
		System.out.println();
		System.out.println(r.getFrequency());
		r.setFrequency(100);
		System.out.println(r);
	}
}
