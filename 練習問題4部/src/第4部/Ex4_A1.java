package 第4部;

public class Ex4_A1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i = i++) {
			if (i % 2 == 0) {
			sum = sum + i;
		i++;
		}
		System.out.println("1から100までの偶数の和は" + sum);
		}
	}
}
