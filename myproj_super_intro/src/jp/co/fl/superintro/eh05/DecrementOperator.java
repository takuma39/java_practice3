package jp.co.fl.superintro.eh05;

public class DecrementOperator {

	public static void main(String[] args) {

		// デクリメント用の値を管理する変数の初期化
		int num = 9;

		System.out.println("---前置デクリメント---");
		System.out.println(num); //初期値の表示
		System.out.println(--num); //足しこまれたあとに表示
		System.out.println(num); //前置デクリメント後の表示

		//デクリメント用の価を管理する変数を再初期化
		num = 9;

		System.out.println("---後置デクリメント---");
		System.out.println(num); //初期値の表示
		System.out.println(num--); //足しこまれたあとに表示
		System.out.println(num); //後置デクリメント後の表示

	}

}
