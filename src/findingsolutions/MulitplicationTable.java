package findingsolutions;

public class MulitplicationTable {

	public static void main(String[] args) {
		multiply2(8);
	}
//		public void MULTIPLY1() {
//		int n=5;
//		for(int i=1;i<=10;i++) {
//			System.out.println(n+ "*" + i + "=" + n*i);
//		}
//	}

	public static void multiply2(int a) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + "*" + i + "=" + a * i);
		}
	}

}
