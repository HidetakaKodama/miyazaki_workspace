package 第1部;

import java.util.Scanner;

public class Ex1_B1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(num);

		int i1 = num / 1000;
		int a = i1 * 10;
		int i2 = num / 100 - a;
		int b = i2 * 10;
		int b2 = a * 10 + b;
		int i3 = num / 10 - b2;
		int i4 = num % 10;

		String str1 = "千の位は" + i1;
		String str2 = "百の位は" + i2;
		String str3 = "十の位は" + i3;
		String str4 = "一の位は" + i4;

		System.out.println("千の位は" + i1);
		System.out.println("百の位は" + i2);
		System.out.println("十の位は" + i3);
		System.out.println("一の位は" + i4);
	}
}
