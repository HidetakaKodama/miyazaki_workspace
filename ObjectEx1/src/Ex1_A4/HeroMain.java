package Ex1_A4;

public class HeroMain {
	public static void main(String[] args) {
		Hero act = new Hero();
		
		act.action();
		act.action("石");
		act.action("弓", 35);
		act.action(15, "剣");
	}
}
