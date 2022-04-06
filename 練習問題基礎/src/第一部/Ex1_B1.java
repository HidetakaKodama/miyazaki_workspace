package 第一部;

import java.util.Scanner;

public class Ex1_B1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(num);

		int i1 = num / 10;
		int i2 = num / 100 - i1;
		int i3 = num / 100
		int i4 = num / 10

		String str1 = "千の位は" + i1;
		String str2 = "百の位は" + i2;
		String str3 = "十の位は" + i3;
		String str4 = "一の位は" + i4;

	}
}
