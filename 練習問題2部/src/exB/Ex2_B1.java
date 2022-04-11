package exB;

// ランダムで二つの整数を表示し、大きいほうの値を表示する

public class Ex2_B1 {
	public static void main(String[] args) {
		int num1 = new java.util.Random().nextInt();
		int num2 = new java.util.Random().nextInt();
		System.out.println(num1);
		System.out.println(num2);
		
		if(num1 > num2) {
			System.out.println("大きい方は" + num1 + "です");
		} else if(num1 < num2) {
			System.out.println("大きいほうは" + num2 + "です");
		} else {
			System.out.println(num1 + "と" + num2 + "は等しいです");
		}
		
	}
}
