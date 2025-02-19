package jp.co.fl.superintro.eh06;

public class IfStatement {

	public static void main(String[] args) {

		//test1 if else文
		//比較用の価を管理する変数の制限を初期化
		int a = 5;
		int b = 5;

		System.out.println("--test1--");
		System.out.println("変数a = " + a);
		System.out.println("変数a = " + b);
		System.out.println("条件：a == b");

		if(a == b) {
			System.out.println("変数aと変数bは等しい");
		} else {
			System.out.println("変数aと変数bは等しくない");
		}

		System.out.println("--------------------------");

		//test2　if else文
		//比較用の価を管理する変数の制限を初期化
		a = 4;
		b = 5;

		System.out.println("--test2--");
		System.out.println("変数a = " + a);
		System.out.println("変数a = " + b);
		System.out.println("条件：a == b");

		if(a == b) {
			System.out.println("変数aと変数bは等しい");
		} else {
			System.out.println("変数aと変数bは等しくない");
		}

		System.out.println("--------------------------");

		//test3　if else文
		//比較用の価を管理する変数の制限を初期化
		a = 2;
		b = 5;

		System.out.println("--test3--");
		System.out.println("変数a = " + a);
		System.out.println("変数a = " + b);
		System.out.println("条件：a != b");

		if(a != b) {
			System.out.println("変数aと変数bは等しくない");
		} else {
			System.out.println("変数aと変数bは等しい");
		}

		System.out.println("--------------------------");

		//test4　if else文
		//比較用の価を管理する変数の制限を初期化
		String str = "テスト";

		System.out.println("--test4--");
		System.out.println("変数str = テスト");
		System.out.println("条件：str.equals(\"テスト\")");

		if(str.equals("テスト")) {
			System.out.println("変数strは\"テスト\"です");
		} else {
			System.out.println("変数strは\"テスト\"ではないです");
		}

		/*エスケープシークエンス
		 * "を表示させたいときは\*または¥"を使う
		*/

		System.out.println("--------------------------");

		//test5　ifネスト文
		//比較用の価を管理する変数の制限を初期化
		a = 7;

		System.out.println("--test5--");
		System.out.println("変数a = " + a);

		System.out.println("条件：a > 0");
		if(a > 0) {
			System.out.println("変数aは0以上");
			//ネスト文
			if(a <= 10) {
				System.out.println("条件：a <= 10");
				System.out.println("変数aは10以下");
			} else {
				System.out.println("変数aは10以上");
			}
		} else {
			System.out.println("変数aは0以下");
		}

	}

}
