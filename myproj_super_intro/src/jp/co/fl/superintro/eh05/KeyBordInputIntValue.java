package jp.co.fl.superintro.eh05;
import java.util.Scanner;

public class KeyBordInputIntValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1つ目の数字を入力してください＞");
		int num1 = sc.nextInt();
		System.out.print("2つ目の数字を入力してください＞");
		int num2 = sc.nextInt();

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

	}

}
