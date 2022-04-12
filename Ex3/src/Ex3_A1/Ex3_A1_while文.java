package Ex3_A1;

public class Ex3_A1_while文 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i < 5) {
			i++;
			for (int j = 0; j < 3; j++) {
			sum += j;
			}
			System.out.println(sum);
		}
		System.out.println("結果は" + sum + "です");
	}
}
