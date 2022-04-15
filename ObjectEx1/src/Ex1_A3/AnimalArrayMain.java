package Ex1_A3;

public class AnimalArrayMain {
	public static void main(String[] args) {
		Animal [] animal = new Animal[5];
		animal[0] = new Animal("猫", 45);
		animal[1] = new Animal("ラクダ", 200);
		animal[2] = new Animal("象", 330);
		animal[3] = new Animal("ネズミ", 20);
		animal[4] = new Animal("うさぎ", 37);
	
		for (int i = 0; i < animal.length; i++) {
		animal[i].info();
		}
	}
}
