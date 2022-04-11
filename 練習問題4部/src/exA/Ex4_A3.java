package exA;

import java.util.Scanner;

public class Ex4_A3 {
	public static void main(String[] args) {
		System.out.println("入力してください。");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		for (int i = 0; i > 0; i++) {
				if (str == "こんにちは") {
					System.out.println(str);
						break;
				}
		}
		System.out.println("もう一度入力してください。");
	}
}
