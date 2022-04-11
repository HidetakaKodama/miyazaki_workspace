package exA;

public class Ex6_A3 {
	public static void main(String[] args) {
		int num = 550;
		int result = waribiki(num);
		System.out.println("3割引された金額は" + result + "円です。");
	}
	public static int waribiki(int num) {
		double result = (int)(num * 0.7);
		return (int)result;
	}
}