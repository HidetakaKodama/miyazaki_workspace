package e4_25;

// 【2_B8】日本の都市で名前に「mori」を含まないものを表示

public class sample1 {

/*

select
  name
from
  city
where
  CountryCode = 'JPN'and name not like %'mori'%;



エラーコード

ERROR 1064 (42000): You have an error in your SQL syntax;
check the manual that corresponds to your MariaDB server
version for the right syntax to use near '%'mori'%' at line 6


 エラー内容

 6行目の %'mori'% にシンタックスエラーが出ている


 解決方法

 ％・・・ワイルドカード（＝どんな文字列にも一致する）
 ％も文字列の一部として考えるのでシングルクォーテーションの中に記述する必要がある

 %'mori'% → '%mori%'になおす


 */
}
