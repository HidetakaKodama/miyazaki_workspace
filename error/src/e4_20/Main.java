package e4_20;

public class Main {
	public static void main(String[] args) {
		Fuga.hoge();
		Fuga.fHoge();
	}
}


/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problem:
型 Fuga の非 static メソッド hoge() を static 参照することはできません

at e4_20.Main.main(Main.java:5)


エラー内容

5行目でエラー
staticメソッドから普通のメソッドを直接参照することはできない。
どのメソッドなのか認識されずにエラーが起きている。


解決方法

呼び出したいメソッドがどれなのかを明示するために、
インスタンスを生成して変数に代入してから呼び出す。

（五行目）
 	Fuga f = new Fuga();
		f.hoge();


*/