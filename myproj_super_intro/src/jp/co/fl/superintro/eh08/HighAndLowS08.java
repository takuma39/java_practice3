package jp.co.fl.superintro.eh08;
import java.util.Scanner;

public class HighAndLowS08 {

	public static void main(String[] args) {

		//Scanner準備
		Scanner sc = new Scanner(System.in);

		//ランダム数値
		int num1 = (int)(Math.random()*9) +1;
		int num2 = (int)(Math.random()*9) +1;

		//answer
		String select;

		//result
		String result = "";

		//対戦回数
		int round = 1;

		//選択回数
		int h = 0;
		int l = 0;


		//loop地点
		while(true) {
			//見出し
			System.out.println("************");
			System.out.println("*High & Low*");
			System.out.println("************");
			System.out.println();

			//カード表示
			System.out.println("  【ROUND" + round + "】");
			System.out.println("*****   *****");
			System.out.println("*   *   *   *");
			System.out.println("* " + num1 + " *  " +  " * ? *");
			System.out.println("*   *   *   *");
			System.out.println("*****   *****");
			System.out.println();

			//選択
			//loop開始
			while(true) {
				System.out.print("High or Low ? (h / l)>");
				select = sc.nextLine();

				//選択結果
				if(select.equals("h")) {
					System.out.println("Highを選択しました");
					break;
				} else if(select.equals("l")) {
					System.out.println("Lowを選択しました");
					break;
				} else {
					System.out.println("『h』か『l』を選択してください");
					System.out.println();
					continue;
				}
			//loop終了
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
				h++;
				if(num1 >= num2) {
					result = "h";
				} else {
					result = "l";
				}

			//Lowの場合
			} else if(select.equals("l")) {
				l++;
				if(num1 <= num2) {
					result = "l";
				} else {
					result = "h";
				}
			}

			//勝敗表示
			if(select.equals(result)) {
				System.out.println("--You Win--");
				System.out.println();
				num1 = (int)(Math.random()*9) +1;
				num2 = (int)(Math.random()*9) +1;
				round++;
				continue;
			} else if(!(select.equals(result))) {
				System.out.println("--You Lose--");
				System.out.println();
				break;
			}
		//loop最終地点
		}

		//終了
		System.out.println();
		System.out.println("--GAME OVER--");
		System.out.println();
		System.out.println("戦績：" + (round - 1) + "連勝");
		System.out.println("Highを選んだ回数：" + h);
		System.out.println("Lowを選んだ回数：" + l);

	}

}
