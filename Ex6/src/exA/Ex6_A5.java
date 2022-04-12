package exA;

// 1～引数までの和を戻り値とするメソッドを
// 利用したプログラム

public class Ex6_A5 {
	public static void main(String[] args) {
		int num = 10;
		int result = sum(num);
		
		System.out.println("1から" + num + "までの和は" + result + "です");
	}
	public static int sum(int num) {
		int sum = 0;
		for (int i = 1 ;i <= num; i++) {
			sum += i;
			if (num < 0) {
				sum = 0;
			}
		}
		return sum;
	}
}
