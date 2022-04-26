package e4_26;

//標準入力から文字列を入力し「end」が入力されるまで
//文字数を表示する

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		while (true){
			int i = 0;
			System.out.print("入力→");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.next();
			i++;
				if (str.equals("end")) {
					System.out.println("終了します。");
				break;
				} else {
					System.out.println("文字数＝" + str.length);
				}
		}
	}
}

/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	length は解決できないか、フィールドではありません

	at e4_26.Sample1.main(Sample1.java:20)



エラー内容

lengthは配列の要素数を取得するが、ここでは配列が存在しないので
エラーが出ている。



解決方法

String型の文字列の長さを返すときは「文字列.length()」メソッドを使う

(20行目) str.length → str.length()

配列の要素数を取得する「変数.length」と混ざらないように注意する


*/