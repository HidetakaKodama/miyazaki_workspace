package Ex3_A2;

import java.util.Scanner;

public class Ex3_A2_doWhile文 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(str);
		
			int i = 0;
			do {
				System.out.println(str);
				i++;
			} while (i < 5);
	}
}
