package exA;

// 配列の要素のうち、値が70以上の要素を表示する

public class Ex5_A1 {
	public static void main(String[] args) {
		int[] scores = {88, 55, 77, 99, 66};
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] <= 70) {
				continue;
			}
			System.out.println("70以上の要素は" + scores[i]);
		}
	}
}