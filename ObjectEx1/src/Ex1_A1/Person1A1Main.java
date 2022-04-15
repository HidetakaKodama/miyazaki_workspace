package Ex1_A1;

public class Person1A1Main {
	public static void main(String[] args) {
		Person1A1 per = new Person1A1();
		
		per.name = "山田太郎";
		per.age = 15;
		
		per.introduce();
		per.getOlder(3);
		per.introduce();
		per.alcohol();
	}
}
