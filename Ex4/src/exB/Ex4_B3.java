package exB;

import java.util.Scanner;

// 整数を標準入力から二つ入力し、
// その最大公約数を表示する

public class Ex4_B3 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		int num2 = s2.nextInt();
		
		for(int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				for (int j = 0; j < i; j++) {
					if (j < i) {
					 j = i;
					System.out.println("二つの数字の最大公約数は" + j + "です");
					}
				}
			}
		}
	}
}