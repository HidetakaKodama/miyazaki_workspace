package exA;

import java.util.Scanner;

public class Ex1_A5 {
	public static void main(String[] args) {
		String str1 = "国語";
		System.out.println(str1);
			Scanner s1 = new Scanner(System.in);
			int num1 = s1.nextInt();
			System.out.println(num1);

		String str2 = "数学";
		System.out.println(str2);
			Scanner s2 = new Scanner(System.in);
			int num2 = s2.nextInt();
			System.out.println(num2);

		String str3 = "英語";
		System.out.println(str3);
			Scanner s3 = new Scanner(System.in);
			int num3 = s3.nextInt();
			System.out.println(num3);

		int i1 = num1 + num2 + num3;
		System.out.println("合計" + i1 + "点");

		double d1 = (double)i1 / 3;
		System.out.println("平均" + d1 + "点");

		}
}
