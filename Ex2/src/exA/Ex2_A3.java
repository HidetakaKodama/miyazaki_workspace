package exA;

import java.util.Scanner;

public class Ex2_A3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.println(num1);
		int num2 = s.nextInt();
		System.out.println(num2);
		
			if (num1 > num2) {
				System.out.println("大きい方は" + num1 + "です");
			} else {
				System.out.println("大きい方は" + num2 + "です");
			}
		
		
	}
}
