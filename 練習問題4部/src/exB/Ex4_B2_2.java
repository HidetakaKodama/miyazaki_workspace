package exB;

//1～100の整数で8の倍数だけ表示しない
//（continue文を使用しない場合）

public class Ex4_B2_2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if ((i % 8) != 0) {
				System.out.println(i);
			if (i == 100) {
				break;
			}
			}
		}
	}
}
