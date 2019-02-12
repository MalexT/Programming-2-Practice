package vezbanje1;

public class Ispisivac2 {
	
	static void od1Do50() {
		for (int i = 1; i <=50; i++) {
			System.out.println(i);
		}
	}
	
	static void od0do30() {
		for (int i = 0; i <= 30; i++) {
			System.out.println(i);
		}
	}
	
	static void od50do1() {
		for (int i = 50; i >=1; i--) {
			System.out.println(i);
		}
	}
	
	static void od32Do2() {
		for (int i = 32; i >=-2; i--) {
			System.out.println(i);
		}
	}
	
	static void od0doN(int N) {
		for (int i = 0; i <=N; i++) {
			System.out.println(i);
		}
	}
	
	static void odNdo0(int N) {
		for (int i = 0; i>=N; i --) System.out.println(i);
	}
	
	static void odAdoB(int A, int B) {
		for(int i = A+1; i<=B;i++) System.out.println(i);
	}
	
	static void odBdoA(int A, int B) {
		for (int i = B; i >=A; i--) {
			System.out.println(i);
		}
	}
}
