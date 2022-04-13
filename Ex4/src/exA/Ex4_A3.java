package exA;

// 「こんにちは」と入力されるまで繰り返し入力を要求する

import java.util.Scanner;

public class Ex4_A3 {
	public static void main(String[] args) {
		System.out.println("入力してください。");
		while (true) {
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
				
			if (str == "こんにちは") {
				System.out.println(str);
						break;
			} else {
				System.out.println("もう一度入力してください。");
			}
		}
	}
}
