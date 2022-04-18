package e4_15;

// オブジェクト指向練習問題1A1の問題です

public class Sample1 {
	String name;
	int age;
	int years;

	void introduce() {
		System.out.println("私は" + name + "です");
		System.out.println("年齢は" + age + "歳です");

	void getOlder() {
		System.out.println("【" + years + "年後】");
	}
	void alcohol() {
		System.out.println("年齢です");
	}
}


/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problem:
構文エラーがあります。"}" を挿入して MethodBody を完了してください

at Ex1_A1.Person1A1.<init>(Person1A1.java:11)
at Ex1_A1.Person1A1Main.main(Person1A1Main.java:5)


エラー内容

一つ目のintroduceのメソッドを波括弧で閉じていないため
メソッドとして正しく定義できておらずエラーが出ている。


解決方法

複数のメソッドを定義するときは各メソッドを
波括弧で閉じるのを忘れないようにする


*/