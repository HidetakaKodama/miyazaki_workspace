package e4_18;

//オブジェクト指向1-A5
//コンストラクタのオーバーロード

public class Sample1 {
	String name;
	int id;
	Sample1(String name, int id) {
		this.name = name;
		this.id = id;
	}
	Sample1() {
		this("名無し", -1);
	}
	void message () {
		System.out.println("ようこそ、" + name + "さん。");
		if (id == -1) {
			System.out.println("あなたのユーザーIDは未設定です。");
		} else {
			System.out.println("あなたのユーザーIDは＜" + id + "＞です。");
		}
	}
}
