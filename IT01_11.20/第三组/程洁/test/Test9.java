package test;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {

		System.out.println("������һ��������10000��������:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i <= 10000&&i>0) {
			for (int k = 1; k <= i; k++) {
				if (k % 7 == 0 || k / 1000 == 7 || k / 100 == 7 || k / 10 == 7) {
					System.out.println(a);
				}
			}
		} else {
			System.out.println("������һ����ȷ����!");
		}
		sc.close();
	}
}