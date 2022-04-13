package exA;

// 配列の要素を全て繋げて表示する

public class Ex5_A2 {
	public static void main(String[] args) {
		String[] English = {"abc", "def", "ghi"};
		String str = String.join("", English);
		System.out.println(str);
		
	}
}
