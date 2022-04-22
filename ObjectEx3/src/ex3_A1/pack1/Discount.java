package ex3_A1.pack1;

// 【パッケージの利用】
// ・Discount MainパッケージがDiscountパッケージを利用する
// ・商品と値段を表示する
// ・cutだけ値段を下げ、メッセージを表示する


public class Discount {
	private String product;
	private int price;
	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void info() {
		System.out.println("これは" + product + "です。");
		System.out.println("値段は" + price + "円です。");
	}
	public void cutIn(int cut) {
		price = price - cut;
		System.out.println("決算セールで" + cut + "円値引きされます。");
	}
}
