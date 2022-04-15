package Ex1_A1;

public class Person1A1CS {
	String name;
	int age;
	Person1A1CS(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void introduce() {
		System.out.println("私は" + name + "です");
		System.out.println("年齢は" + age + "です");
	}
}
