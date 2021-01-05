package jp.co.fl.superintro.eh07;

public class Continuestatement {

	public static void main(String[] args) {

		System.out.println("--ループを開始--");
		while(true) {

			//1から9のランダムな数字を取得
			int num = (int)(Math.random()*9) + 1;
			//+1を無くすと0〜8までの数字
			//0〜99の場合、(int)(Math.random()*100)

			if(num == 4) {
				//4の場合は再度ループの先頭に戻る
				System.out.println(num + "がでたので、ループの先頭に戻ります。");
				continue;
			}

			//ランダム数値の表示
			System.out.println("ランダム数値 = " + num);

			if(num % 2 == 0) {
				//4以外の偶数数値なら無限ループから抜ける
				System.out.println("4以外の偶数数値がでたので、ループから抜けます");
				break;
			}
		}

		System.out.println("--ループを終了--");

	}

}
