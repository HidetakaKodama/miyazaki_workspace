package exA;

import java.util.Scanner;

public class Ex2_A4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(num);
			
		if (num >= 85) {
			System.out.println("優");
		} else if (84 >= num && num >= 75) {
			System.out.println("良");
		} else if (74 >= num && num >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
	}
}
