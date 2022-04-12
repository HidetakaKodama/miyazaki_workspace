package e4_11;

//1～引数までの和を戻り値とするメソッドを
//利用したプログラム

public class Sample1 {
	public static void main(String[] args) {
		int num = 10;
		int result = sum(num);

		System.out.println("1から" + num + "までの和は" + result + "です");
	}
	public static int sum(int num) {
		int sum = 0;
		for (int i = 1 ;i <= num; i++) {
			sum += i;
			if (num < 0) {
				sum = 0;
			}
		return sum;
		}
	}
}


/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problem:
このメソッドは型 int の結果を戻す必要があります

at exA.Ex6_A5.sum(Ex6_A5.java:13)
at exA.Ex6_A5.main(Ex6_A5.java:9)


エラー内容
returnをfor文の中に書いており、戻り値として
参照されていないためエラーが起きている。


解決方法

・returnをfor文の外にかく

*/
