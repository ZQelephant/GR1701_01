package com.zk.qhit.J5;

import java.util.Scanner;

public class IntegerN {
	// 9.��дJAVA����ͨ������̨����һ������N����N������10000�����������7�ı����Ͱ���7�����֡�
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������N(N<10000)��");

		int N = sc.nextInt();
		System.out.println("N��Χ������7�ı����Ͱ���7�����֣�");

		if (N < 10000) {
			for (int i = 1; i <= N; i++) {
				if (i % 7 == 0
						&& ((i % 10 == 7) || (i / 10 % 10 == 7)
								|| (i / 100 % 10 == 7) || (i / 10000 == 7))) {
					System.out.println(i);

				}

			}
			if (N >= 10000 || N <= 0) {
				System.out.println("�������⡣");
			}
		}

	}

}
