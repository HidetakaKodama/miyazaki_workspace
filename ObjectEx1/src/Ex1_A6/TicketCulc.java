package Ex1_A6;

// static修飾子

public class TicketCulc {
	static int TicketField;
	static void TicketMethod(int basic, int age) {
		System.out.println("チケットの基本額を入力してください：" + basic);
		System.out.println("年齢を入力してください：" + age);
			int price =0;
			if (age <= 15) {
				price = basic - 500;
			} else {
				price = basic + 500;
			}
			System.out.println("チケット代は" + price + "円です。");
	}
}
