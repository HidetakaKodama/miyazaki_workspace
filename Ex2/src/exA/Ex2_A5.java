package exA;

import java.util.Scanner;

public class Ex2_A5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.println(num1);
		int num2 = s.nextInt();
		System.out.println(num2);
		
		if (num1 == 1 && num2 ==3) {
			System.out.println("チケットは1000円です。");
		} else {
			System.out.println("チケットは2000円です。");
		}
			
		
	}
	
}
