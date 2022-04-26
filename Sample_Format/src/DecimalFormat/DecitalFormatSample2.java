package DecimalFormat;

import java.text.DecimalFormat;

public class DecitalFormatSample2 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		double num = 3.14159265;
		String str = df.format(num);
		System.out.println(str);
	}
}
