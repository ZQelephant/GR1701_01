package com.WH;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();
		if (a > 10000) {
			System.out.println("����Ĳ���ȷ");

		} else {

			for (int i = 7; i < 10000; i++) {
				if ((i % 7 == 0)
						&& (i / 1000 == 7 || i / 100 % 10 == 7
								|| i / 10 % 10 == 7 || i % 10 == 7)) {
					System.out.println(i);

				}

			}

		}

	}

}
