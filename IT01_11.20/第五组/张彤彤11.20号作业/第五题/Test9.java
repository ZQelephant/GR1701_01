package com.gaojie.qhit01;

import java.util.Scanner;


public class Test9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������N(N<10000)");
		int N = sc.nextInt();
		System.out.println("N��Χ�ڵ�����7�ı����Ұ����ߵ������±�ʾ��");
		if (N < 10000) {
			for (int i = 1; i <= N; i++) {
				if ((i % 7 == 0)
						&& ((i % 10 == 7) || (i / 10 % 10 == 7)
								|| (i / 100 % 10 == 7) || (i / 10000 == 7))) {
					System.out.println(i);

				}

			}
		}
		if (N >= 10000 || N <= 0) {
			System.out.println("��Χ֮��");
		}

	}
}
