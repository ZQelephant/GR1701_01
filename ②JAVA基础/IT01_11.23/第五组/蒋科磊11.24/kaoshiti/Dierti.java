package kaoshiti;

import java.util.Scanner;

public class Dierti {

	public static void main(String[] args) {

		System.out.print("������һ����λ����");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("������ʮλ����" + a / 10 % 10);
	}
}
