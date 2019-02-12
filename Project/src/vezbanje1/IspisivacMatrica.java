package vezbanje1;

public class IspisivacMatrica {

	static void matrica() {
		for(int i=1; i<5;i++) {
			for(int j=1; j<5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	static void matrica(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j)
					System.out.print(1 +" ");
				else
					System.out.print(0 +" ");
			}
			System.out.println();
		}
	}
	
	
}
