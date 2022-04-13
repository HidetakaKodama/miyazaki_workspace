package e4_12;

import java.util.Scanner;

//整数を標準入力から二つ入力し、
//その最大公約数を表示する

public class Sample1 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		int num2 = s2.nextInt();

		int max = 0;
		for(int i = 1; i <= num1; i++) {
			if (num1 % i = 0 && num2 % i = 0) {
				for (int j = 0; j < i; j++) {
					if (j < i) {
					 max = i;
					}
				}
			}
		}
		System.out.println("二つの数字の最大公約数は" + max + "です");
	}
}


/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problems:
	トークン "=" に構文エラーがあります。正しくは <= です
	トークン "=" に構文エラーがあります。正しくは <= です

	at exB.Ex4_B3.main(Ex4_B3.java:17)


エラー内容

17行目の「=」にアラーが出ている
ここは左辺と右辺の条件がtrueであるかを確かめる文であり、
「=」は変数に値を代入する演算子なので条件になっておらず
エラーが出ている

解決方法

「=」は変数に値を代入する演算子なので、「equal」の意味で使いたいときは
「==」を使用する。

*/

