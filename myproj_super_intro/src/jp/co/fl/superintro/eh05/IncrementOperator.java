package jp.co.fl.superintro.eh05;

public class IncrementOperator {

	public static void main(String[] args) {

		// インクリメント用の値を管理する変数の初期化
		int num = 9;

		System.out.println("---前置インクリメント---");
		System.out.println(num); //初期値の表示
		System.out.println(++num); //足しこまれたあとに表示
		System.out.println(num); //前置インクリメント後の表示

		//インクリメント用の価を管理する変数を再初期化
		num = 9;

		System.out.println("---後置インクリメント---");
		System.out.println(num); //初期値の表示
		System.out.println(num++); //足しこまれたあとに表示
		System.out.println(num); //後置インクリメント後の表示

	}

}
