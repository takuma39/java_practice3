package jp.co.fl.superintro.eh08;

public class HighAndLowS03 {

	public static void main(String[] args) {

		System.out.println("************");
		System.out.println("*High & Low*");
		System.out.println("************");
		System.out.println();

		//ランダム数値
		int num1 = (int)(Math.random()*9) +1;

		//カード表示
		System.out.println("  【問題表示】");
		System.out.println("*****   *****");
		System.out.println("*   *   *   *");
		System.out.println("* " + num1 + " *  " +  " *   *");
		System.out.println("*   *   *   *");
		System.out.println("*****   *****");


		System.out.println();
		System.out.println("--GAME OVER--");

	}

}
