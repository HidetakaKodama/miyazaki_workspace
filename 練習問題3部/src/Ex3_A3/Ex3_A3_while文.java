package Ex3_A3;

public class Ex3_A3_while文 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			System.out.println(i);
		sum += i;
		i++;
			System.out.println("合計" + sum);
		}
		System.out.println("1から10までの合計は" + sum + "です。");
	}
}

