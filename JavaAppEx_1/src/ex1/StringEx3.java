package ex1;

// 標準入力から文字列を入力し「end」が入力されるまで
// その文字数を表示するプログラムを作成する

import java.util.Scanner;

public class StringEx3 {
	public static void main(String[] args) {
		while (true){
			int i = 0;
			System.out.print("入力→");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.next();
			i++;
				if (str.equals("end")) {
					System.out.println("終了します。");
				break;
				} else {
					System.out.println("文字数＝" + str.length());
				}
		}
	}
}
