package ex3_A1.pack2;


//【パッケージの利用】
//・Discount MainパッケージがDiscountパッケージを利用する
//・商品と値段を表示する
//・cutだけ値段を下げ、メッセージを表示する


import ex3_A1.pack1.Discount;

public class DiscountMain {
	public static void main (String[] args) {
		Discount dis = new Discount();
		dis.setProduct("パソコンラック");
		dis.setPrice(29800);
		dis.info();
		dis.cutIn(3700);
		dis.info();
	}
}
