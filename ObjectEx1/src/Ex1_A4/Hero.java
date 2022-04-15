package Ex1_A4;

public class Hero {
	void action () {
		System.out.println("敵に攻撃。");
	}
	void action (String weapon)  {
		System.out.println(weapon + "で敵に攻撃。");
	}
	void action (String weapon, int damage) {
		System.out.println(weapon + "で攻撃。敵に" + damage + "のダメージ！") ;
	}
	void action (int damage, String weapon) {
		for (int i = 0; i < 3; i++) {
		System.out.println(weapon + "で攻撃。敵に" + damage + "のダメージ！");
		}
	}
}
