package Ex2_A1;

public class Warikan {
	private int menu1;
	public int getMenu1() {
		return this.menu1;
	}
	public void setMenu1(int menu1) {
		this.menu1 = menu1;
	}
	private int menu2;
	public int getMenu2() {
		return this.menu2;
	}
	public void setMenu2(int menu2) {
		this.menu2 = menu2;
	}
	private int menu3;
	public int getMenu3() {
		return this.menu3;
	}
	public void setMenu3(int menu3) {
		this.menu3 = menu3;
	}
	private int ppl;
	public int getPpl() {
		return this.ppl;
	}
	public void setPpl(int ppl) {
		this.ppl = ppl;
	}

	public void getAverage() {
		int average = (menu1 + menu2 + menu3) / ppl;
		System.out.println("4人で割り勘にした場合、一人当たりの金額は" + average + "円（小数点以下切り捨て）です。");
	}
}
