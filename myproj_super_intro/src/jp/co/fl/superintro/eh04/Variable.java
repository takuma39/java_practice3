package jp.co.fl.superintro.eh04;

public class Variable {

	public static void main(String[] args) {

		//タイトル
		String title;
		title = "Java入門";

		//価格
		int price;
		price = 3000;

		System.out.print("本のタイトルは");
		System.out.print(title);
		System.out.println("です");

		System.out.println();

		System.out.print("本の価格は");
		System.out.print(price);
		System.out.println("円です");


		/*
		 * printは改行なし
		 * printlnは改行あり
		 * lnは「line」の略
		 */

		System.out.println();
		System.out.println("エスケープ文字の\n改行");

		/*
		*\nで改行　\などを「エスケープ文字」という
		*\"あああ\"　で" " /  \'あああ\’　で' '

		*バックスラッシュはoptionキーを押しながら¥マーク

		*\b      バックスペース
		*\t      水平タブ
		*\n      改行
		*\r      復帰
		*\f      改ページ
		*\'      シングルクオーテーション
		*\"      ダブルクオーテーション
		*\\      \文字
		*\ooo    8進数の文字コードが表す文字
		*/
	}

}
