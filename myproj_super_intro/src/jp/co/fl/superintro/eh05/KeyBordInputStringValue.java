package jp.co.fl.superintro.eh05;
import java.util.Scanner;

public class KeyBordInputStringValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("名前を入力してください＞");
		String name = sc.nextLine();
		System.out.print("私の名前は" + name + "です。");

	}

}
