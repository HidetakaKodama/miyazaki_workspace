package exA;

import java.util.Scanner;

public class Ex6_A4 {
	public static void main(String[] args) {
		System.out.println("金額を入力してください");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int result = waribiki(num);
		System.out.println("割引後の金額は" + result + "円です");
	}
	public static int waribiki(int num) {
		if(num >= 20000) {
		int sum = (int)(num * 0.6);
		return (int)sum;
		} else if (num >= 10000 && num < 20000) {
		int sum = (int)(num * 0.8);
		return (int)sum;
		} else if (num >= 5000 && num < 10000) {
	    int sum = (int)(num * 0.9);
	    return (int)sum;
		} else {
		int sum = (num);
		return (int)sum;
		}
	}
}