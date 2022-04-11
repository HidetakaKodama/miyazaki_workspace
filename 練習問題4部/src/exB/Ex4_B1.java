package exB;

// 1～100までの整数で3の倍数かつ5で割れる整数
// を全て表示する

public class Ex4_B1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i);
			if (i == 100) {
				break;
			}
		}
	}
}}
