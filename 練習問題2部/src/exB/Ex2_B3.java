package exB;

import java.util.Scanner;

public class Ex2_B3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (((num % 4 == 0) || (num % 100 != 0)) && (num % 400 == 0)) {
			System.out.println("花は咲く");
		} else if ((num % 100 == 0) || (num % 400 != 0)) {
			System.out.println("花は咲かない");
		} else {
			System.out.println("花は咲かない");
		}
	}
}