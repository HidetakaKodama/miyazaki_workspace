package exB;

//九九の表を表示する

public class Ex3_B2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
				for(int j = 1; j<= 9; j++) {
					System.out.print(i*j + "");
				}
				System.out.println();
		}
	}
}
