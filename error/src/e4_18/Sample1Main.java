package e4_18;

//オブジェクト指向1-A5
//コンストラクタのオーバーロード

public class Sample1Main {
	public static void main(String[] args) {
		Sample1 info1 = new Sample1(878787, "ハナ");
		Sample1 info2 = new Sample1();

		info1.message();
		info2.message();
	}
}


/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	コンストラクター User(int, String) は未定義です

	at Ex1_A5.UserMain.main(UserMain.java:5)


エラー内容

Sample1のクラスで定義したコンストラクトの引数の型と
8行目のインスタンスがの引数の型が一致していないため、
利用できるコンストラクタが存在せずエラーが出ている。


解決方法

8行目の引数を(String name, int id)の形に直す。
	(878787, "ハナ") → ("ハナ", 878787)
オーバーロードするときは引数の構成に注意する必要がある。


*/