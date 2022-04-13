package exC;

// 「*」を利用して三角形（長さ5）を表示する

public class Ex3_C1_1 {
	public static void main(String[] args) {
		String str = "*";
		for (int i = 0; i < 5; i++) {
			for (int j =0; j < i; j++) {
				System.out.print(str);
			}
			System.out.println(str);
		}
	}
}
