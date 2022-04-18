
public class StringName {
	private String name;
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException;
			("名前が入力されていません。処理を中断します。")
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException
			("名前が短すぎます。処理を中断します・")
		}
		if (10 <= name.length()) {
			throw new IllegalArgumentException
			"名前が長すぎです。処理を集団します。"
		}
		this.name = name;
	}
}
