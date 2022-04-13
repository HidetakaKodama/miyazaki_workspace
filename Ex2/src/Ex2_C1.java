import java.util.Scanner;

public class Ex2_C1 {
	
// ユーザーとコンピューターがじゃんけんを一回行うプログラム
	
	public static void main(String[] args) {
		System.out.println("数字を入力してください");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt(3);
		int num2 = new java.util.Random().nextInt(3);
		
		if ((num1 == 0 && num2 == 0) || (num1 == 1 && num2 == 2) || (num1 == 0 && num2 == 1)) {
			System.out.println("コンピューターの勝ち");
		} else if ((num1 == 0 && num2 == 2) || (num1 == 1 && num2 == 0) || (num1 == 2 && num2 == 1)) {
			System.out.println("あなたの勝ち");
		} else {
			System.out.println("あいこ");
		}
	}
}
