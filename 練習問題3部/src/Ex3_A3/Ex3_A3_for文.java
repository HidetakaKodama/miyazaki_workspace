package Ex3_A3;

public class Ex3_A3_for文 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i<= 10; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("1から10までの合計は" + sum + "です。");
	}
}
