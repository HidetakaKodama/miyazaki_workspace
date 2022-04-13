package e4_13;

//整数の一次元配列を引数とし、全要素の合計値を
//戻り値とするメソッド

public class Sample1 {
	public static void main(String[] args) {
		int[] num = { 15, 35, 50, 40 };
		int result = add(num);
		System.out.println("合計は" + sum + "です");
	}
	public static int add(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
		sum = sum + num[i];
		}
		return sum;
	}
}
