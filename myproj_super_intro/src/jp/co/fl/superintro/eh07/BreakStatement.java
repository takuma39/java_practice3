package jp.co.fl.superintro.eh07;
import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//カウンタ変数
		int count = 0;

		System.out.println("--ループを開始--");
		while(true) {
			System.out.print("ループを続けるなら「y」を入力してください>");
			String result = sc.nextLine();

			//入力判定
			if(result.equals("y")) {
				//カウントを増やす
				count++;
				System.out.println(count + "回目のループ");
				System.out.println();
			} else {
				System.out.println("y以外の" + result + "が入力されたので終了します。");
				break;
			}
		}

		System.out.println("--ループを終了--");

	}

}
