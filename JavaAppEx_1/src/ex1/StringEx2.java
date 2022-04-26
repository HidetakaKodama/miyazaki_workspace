package ex1;

// 標準入力から電話番号をハイフン付きで入力し、
// 市外局番のみを表示する

import java.util.Scanner;

public class StringEx2 {
	public static void main(String[] args) {
		System.out.print("電話番号→");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		String[] values = number.split("-");
		for (int i = 0; i < values.length; i++) {
		}
		System.out.println("市外局番は" + "「" + values[0] + "」");
	}
}
