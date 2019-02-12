package task1.test;

import task1.HomeAppliance;
import task1.TV;

public class TestHomeAppliance {

	public static void main(String[] args) {
		HomeAppliance ha1 = new HomeAppliance(true, "Laptop Acer A315");
		HomeAppliance ha2 = new HomeAppliance(true, "Canon DSLR EOS 5D");
		TV tv1 = new TV(true, "Samsung UE40", 1);
		TV tv2 = new TV(true, "Samsung UE40", 1);
		
		ha1.turnOnOrOff();
		System.out.println(ha1);
		
		ha1.turnOnOrOff();
		System.out.println(ha1);
		
		if(ha1.equals(ha2))
			System.out.println("The same appliances");
		else
			System.out.println("They are 2 different appliances");
		
		System.out.println();
		
		tv1.turnOnOrOff();
		System.out.println(tv1);
		
		tv1.turnOnOrOff();
		System.out.println(tv1);
		
		if(tv1.equals(tv2))
			System.out.println("TV's are equal");
		else
			System.out.println("TV's are not the same");
					
	}
}
