package com.jtc.qhit01;

import java.util.Scanner;


public class Test9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������һ��������10000����N");

		int N = sc.nextInt();

		System.out.println("N��Χ������7�ı����Ͱ���7��������");

		if (N > 10000) {
			System.out.println("������Χ");
		}

		else {
			for (int i = 1; i <= N; i++) {
				if (i % 7 == 0
						&& (i % 10 == 7 || i / 10 % 10 == 7
								|| i / 100 % 10 == 7 || i / 1000 == 7)) {
					System.out.println(i);
				}
			}

		}sc.close();
	}

}
