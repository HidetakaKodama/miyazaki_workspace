package exB;

//整数5に5を加算する処理を100になるまで繰り返し、
//何回繰り返したのかを表示する

public class Ex3_B1 {
	public static void main(String[] args) {
		int num = 1;
		for (int i = 5; i <= num; i++) {
		i += 5;
			if (num == 100) {
				break;
			}
			System.out.println("5を加算した回数は" + i + "回です");
		}
	}
}
