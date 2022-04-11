package exA;

import java.util.Scanner;

public class Ex1_A4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(num);

			double d1 = num * 1.08;
			int i1 = (int)d1;
			System.out.println("税込" + i1 + "円");
	}
}
