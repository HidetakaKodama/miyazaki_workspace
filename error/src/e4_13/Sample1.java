package e4_13;

//整数の一次元配列を引数とし、全要素の合計値を
//戻り値とするメソッド

public class Sample1 {
	public static void main(String[] args) {
		int[] num = { 15, 35, 50, 40 };
		int result = add(num);
		System.out.println("合計は" + sum + "です");
	}
	public static int add(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
		sum = sum + num[i];
		}
		return sum;
	}
}


/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problem:
sum を変数に解決できません

at e4_13.Sample1.main(Sample1.java:10)


エラー内容
下のメソッド内で宣言したsumはそのブロック内でしか使用できないため
10行目のsumが変数として参照されておらずエラーが出ている。


解決方法
戻り値を受け取る変数としてint resultを用意しているので
10行目のsumをresultに変える

*/