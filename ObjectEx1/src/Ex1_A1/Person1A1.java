package Ex1_A1;

public class Person1A1 {
	
	String name;
	int age;
	
	void introduce() {
		System.out.println("私は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
	}
	void getOlder(int years) {
		age = age + years;
		System.out.println("【" + years + "年後】");
	}
	void alcohol() {
		if (age >= 20) {
			System.out.println("飲酒できる年齢です");
		} else if (age < 20) {
			System.out.println("まだ飲酒できる年齢ではありません");
		}
}
}