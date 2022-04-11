package e4_8;

//Ex5_A1の問題
//配列の要素の中で70以上のものを表示する

public class sample1 {
	public static void main(String[] args) {
		int[] scores = {88, 55, 77, 99, 66};
		for (int i = 0; i < scores.length; i++);
			for (int i = 0; i < scores.length; i++);
				if (scores[i] <= 70) {
					continue;
				}
					System.out.println("70以上の要素は" + scores[i]);

			}
	}


/*

エラーコード

Exception in thread "main" java.lang.Error: Unresolved compilation problems:
	i を変数に解決できません
	i を変数に解決できません

	at 第5部.Ex5_A1.main(Ex5_A1.java:8)


エラー内容
10行目をセミコロンで閉じているため、
for文の中で定義した変数iがそのあとの部分で参照されていない


解決方法
for文節などは波括弧で閉じる


*/
