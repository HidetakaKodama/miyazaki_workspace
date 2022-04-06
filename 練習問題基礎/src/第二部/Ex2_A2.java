package 第二部;

import java.util.Scanner;

class Ex2_A2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(num);

		String str1 = String.valueOf(num);

		if(str1.equals("1")) {
			System.out.println("赤");
		} else if (str1.equals("2")) {
			System.out.println("黄");
		} else {
			System.out.println("青");
		}
		}
}
