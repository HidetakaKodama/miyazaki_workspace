//JAVA基礎問題 第1部 基本知識

package e4_6;

//問1-B2

public class sample1 {
	public static void main(String[] args) {
		int i1 = new java.util.Random().nextInt(i1);
		int i2 = new java.util.Random().nextInt(i2);
		System.out.println(i1);
		System.out.println(i2);
	}
}


/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
ローカル変数 i1 が初期化されていない可能性があります
ローカル変数 i2 が初期化されていない可能性があります

at 第一部.Ex1_B2.main(Ex1_B2.java:5)


エラー内容

9.10行目の括弧の中には範囲を指定する値を
入れることができるが、
変数i1とi2（まだ定義されていない）を
入れている為、エラーが出ている。


解決方法

問題文には乱数の範囲を指定する指示がないため、
（）の中には何も入れない。

*/