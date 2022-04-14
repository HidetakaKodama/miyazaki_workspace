package exB;

import java.util.Scanner;

// 標準入力から整数を入力し、その値が
// 配列内に存在するかどうか表示する

public class Ex5_B1 {
	public static void main(String[] args) {
		int [] scores = { 88,55,77,99,66 };
		boolean isFound = false;
		for (int i = 0; i < scores.length; i++) {
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			if (num == scores[i]) {
				isFound = true;
			}
		}
		if (isFound) {
			System.out.println("見つかりました");
		} else {
			System.out.println("見つかりませんでした");
		}
	}
}
