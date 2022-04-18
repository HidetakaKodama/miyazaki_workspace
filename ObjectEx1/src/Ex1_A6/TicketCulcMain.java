package Ex1_A6;

import java.util.Scanner;

public class TicketCulcMain {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		int num2 = s2.nextInt();

		TicketCulc.TicketMethod(num1, num2);
	}
}
