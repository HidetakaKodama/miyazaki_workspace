package 第一部;

import java.util.Scanner;

public class Ex1_A3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.println(num1);

		int num2 = s.nextInt();
		System.out.println(num2);

			int num3 = num1 + num2;
			double d1 = num3;
			double d2 = d1 / 2;
			System.out.println("平均値は"+ d2);
	}
}
