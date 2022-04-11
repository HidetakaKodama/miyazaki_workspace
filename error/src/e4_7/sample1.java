package e4_7;

import java.util.Scanner;

// 練習問題2部A6の問題です。

public class sample1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.println(num1);
		int num2 = s.nextInt();
		System.out.println(num2);
		
		if (num1 == 1; num2 == 3) {
			System.out.println("チケットは1000円です。");
		}
	}
}


/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
The target type of this expression must be a functional interface
トークン ";" に構文エラーがあります。正しくは :: です

at 第2部.Ex2_A6.main(Ex2_A6.java:13)


エラー内容
if文内の左右の条件を「かつ」で繋ごうとして
セミコロンを入れてしまった為、
構文エラーが起きている。


解決方法

「かつ」を表す「&&」を使用する。

*/