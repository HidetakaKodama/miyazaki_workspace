package exB;

import java.util.Scanner;

// 年数を引数とし、明治時代ならばtrue、そうでなければ
// falseを戻り値として返すメソッド

public class Ex6_B3 {
	public static void main(String[] args) {
		System.out.println("年数を入力してください");
		boolean year = false;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (num <= 1912 && num >= 1868) {
			year = true;
			System.out.println();
		}
		
		if (year) {
			System.out.println("true");
		} else { 
			System.out.println("false");
		}
	}
}

