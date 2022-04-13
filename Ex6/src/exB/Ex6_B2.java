package exB;

// 二つの整数を引数とし、その最大公約数を
// 戻り値として返すメソッド

public class Ex6_B2 {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 45;
		int result = kouyaku(num1, num2);
		System.out.println("二つの数字の最大公約数は" + result + "です");
	}
	public static int kouyaku(int num1, int num2) {
		int max = 0;
		for(int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				for (int j = 0; j < i; j++) {
					if (j < i) {
					 max = i;
					}
				}
			}
		}
		return max;
	}
}
