package exA;

// 配列内の全要素の最大値を表示する

public class Ex5_A3 {
	public static void main(String[] args) {
		int[] scores = {88, 55, 77, 99, 66};
		int max = scores[0];
		
		for(int i = 1; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				System.out.println("全要素の最大値は" + max + "です");
			}
		}
	}
}
