package kaoshiti;

import java.util.Scanner;

public class Disanti {

	public static void main(String[] args) {

		System.out.print("������һ��������10000��������");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a <= 10000 && a >= 0) {
			for (int i = 1;; i++) {
				a = a / 10;
				if (a <= 0) {
					System.out.println("������һ��" + i + "λ����");
					break;
				}
			}
		} else {
			System.out.println("������һ����ȷ������");
		}
}
}