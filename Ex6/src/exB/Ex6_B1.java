package exB;

// 長方形の縦の長さと横の長さ（整数）を引数とし、
// 「＊」を利用して長方形を表示する

public class Ex6_B1 {
	public static void main(String[] args) {
		int height = 5;
		int width = 15;
		int result = rectangle(height, width);
		System.out.println("*");
	}
	public static int rectangle(int height, int width);
	for (int i = 1; i <= 3; i++) {
		for (int j =1; j <= height; j++) {
			System.out.print("*");
		}

	}
}
