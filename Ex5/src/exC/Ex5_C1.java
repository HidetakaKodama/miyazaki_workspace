package exC;

public class Ex5_C1 {
	public static void main(String[] args) {
		int jun = 0;
		int[] a = { 18, 4, 12, 0, 26, 18 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = jun;
					
				}
			}
			System.out.println(a[i]);
		}
	}
}
