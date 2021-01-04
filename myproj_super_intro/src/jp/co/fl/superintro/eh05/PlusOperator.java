package jp.co.fl.superintro.eh05;

public class PlusOperator {

	public static void main(String[] args) {

		int i = 3;
		int j = 1;

		//文字列連結を使用せず表示
		System.out.print("1行の文字を");
		System.out.print(i);
		System.out.println("行のプログラムで表示しています。");

		//文字連結を使用した表示
		System.out.println("実は、" + j + "行のプログラムで表示することも可能です。");

		//四則演算に優先順位ルールによる文字列連結と計算の順序を確認
		System.out.println("i + j =" + i + j);
		System.out.println("i + j =" + (i + j));

	}

}
