package e4_19;

// 継承

public class SubSample extends SuperSample {
	public String pet2;
	SubSample(){
		super(pet1);
		this.pet2 = "犬";
	}
	public void showPet2() {
		System.out.println("私は" + pet2 + "を飼っています。");
	}
	public void showPets() {
		System.out.println("私は" + pet1 + "と" + pet2 + "を両方飼っています。");
	}
}


/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	明示的にコンストラクターを起動している間、インスタンス・フィールド pet1 は参照できません

	at Ex2_A2.SubPet.<init>(SubPet.java:6)
	at Ex2_A2.SuperPetMain.main(SuperPetMain.java:7)
	

エラー内容

スーパークラスのコンストラクタに引数が定義されていない状態で
サブクラスにsuper()の記述をしているため、呼び出そうとしているpet1の
コンストラクタを正しく呼び出せずにエラーが起きている。


解決方法

SuperSampleのデフォルトコンストラクタは自動的に呼び出されるため、
8行目の記述が不要。
super()はスーパークラスのコンストラクタに引数が定義されている場合に使用する。


*/