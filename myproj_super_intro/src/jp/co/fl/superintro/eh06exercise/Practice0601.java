package jp.co.fl.superintro.eh06exercise;
import java.util.Scanner;

public class Practice0601 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("数値を入力>");
		int num = sc.nextInt();

		if(num % 2 == 0) {
			System.out.println(num + "は偶数です");
		} else {
			System.out.println(num + "は奇数です");
		}

	}

}
