package jp.co.fl.superintro.eh08;
import java.util.Scanner;

public class HighAndLowS07 {

	public static void main(String[] args) {

		//Scanner準備
		Scanner sc = new Scanner(System.in);

		//ランダム数値
		int num1 = (int)(Math.random()*9) +1;
		int num2 = (int)(Math.random()*9) +1;

		//answer
		String select;

		//result
		String result;


		//loop地点
		while(true) {


		//見出し
		System.out.println("************");
		System.out.println("*High & Low*");
		System.out.println("************");
		System.out.println();

		//カード表示
		System.out.println("  【問題表示】");
		System.out.println("*****   *****");
		System.out.println("*   *   *   *");
		System.out.println("* " + num1 + " *  " +  " * ? *");
		System.out.println("*   *   *   *");
		System.out.println("*****   *****");
		System.out.println();

		//選択
		System.out.print("High or Low ? (h / l)>");
		select = sc.nextLine();

		//選択結果
		if(select.equals("h")) {
			System.out.println("Highを選択しました");
		} else if(select.equals("l")) {
			System.out.println("Lowを選択しました");
		} else {
			System.out.println("『h』か『l』を選択してください");
		}
		System.out.println();

		//結果表示
		System.out.println("  【結果表示】");
		System.out.println("*****   *****");
		System.out.println("*   *   *   *");
		System.out.println("* " + num1 + " *   " +  "* " + num2 + " *");
		System.out.println("*   *   *   *");
		System.out.println("*****   *****");
		System.out.println();

		//勝敗
		//Highの場合
		if(select.equals("h")) {
			if(num1 >= num2) {
				result = "h";
				System.out.println("--You Win--");
				System.out.println();
				num1 = (int)(Math.random()*9) +1;
				num2 = (int)(Math.random()*9) +1;
				continue;
			} else {
				result = "l";
				System.out.println("--You Lose--");
				break;
			}

		//Lowの場合
		} else if(select.equals("l")) {
			if(num1 <= num2) {
				result = "l";
				System.out.println("--You Win--");
				System.out.println();
				num1 = (int)(Math.random()*9) +1;
				num2 = (int)(Math.random()*9) +1;
				continue;
			} else {
				result = "h";
				System.out.println("--You Lose--");
				break;
			}
		}
		System.out.println();

		//loop最終地点
		}

		//終了
		System.out.println();
		System.out.println("--GAME OVER--");

	}

}
