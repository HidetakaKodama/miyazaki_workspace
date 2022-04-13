package exB;

// 整数の一次元配列を引数とし、全要素の合計値を
// 戻り値とするメソッド

public class Ex6_B5 {
	public static void main(String[] args) {
		int[] num = { 15, 35, 50, 40 };
		int result = add(num);
		System.out.println("合計は" + result + "です");
	}
	public static int add(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		sum += a[i];
		}
		return sum;
	}
}
