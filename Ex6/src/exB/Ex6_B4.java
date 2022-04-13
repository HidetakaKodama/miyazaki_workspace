package exB;

// 整数の一次元配列を引数とし、その最大値を
// 戻り値として返すメソッド

public class Ex6_B4 {
	public static void main(String[] args) {
		int[] num = { 12, 34, 56, 43 };
		int result = max(num);
		System.out.println("最大値は" + result + "です");
	}
	public static int max(int[] a) {
		int max = 0;
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
}
