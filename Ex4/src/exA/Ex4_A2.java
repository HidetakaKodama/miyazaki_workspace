package exA;

// 標準入力から正の整数を5回入力し、
// 最も大きい値を表示する

import java.util.Scanner;

public class Ex4_A2 {
	public static void main(String[] args) {
		int max = 0;
		for (int i = 0; i < 5; i++) {
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			
			if (num > max) {
				max = num;
			}
		}
			System.out.println("最も大きい値は" + max + "です");
	}
}
