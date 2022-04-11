package 第6部;

import java.util.Scanner;

public class Ex6_A2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		double result = average(num1, num2);
		System.out.println("二つの値の平均は" + result + "です。");
	}
	public static double average(int num1, int num2) {
		int sum = num1 + num2;
		double ave = sum / 2;
		return ave;
	}
}
