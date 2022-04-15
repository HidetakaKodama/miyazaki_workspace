package Ex1_A2;

public class Person1A2Main {
	public static void main(String[] args) {
		Person1A2 per = new Person1A2("山田太郎", 40);
		
		per.introduce();
		per.getOlder(15);
		per.introduce();
	}
}
