package com;

import java.util.Scanner;

/**
 * @author ���� E-mail:271406@163.com
 * @date ����ʱ�䣺2017��11��17�� ����7:44:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Nine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ֵ���ɴ���10000");
		int a = sc.nextInt();
		if (a > 10000) {
			System.out.println("����");
		} else {
			for (int i = 1; i < a; i++) {
				if (i % 7 == 0 || i %1000 == 7 || i % 100 == 7
						|| i / 10 % 10 == 7 || i % 10 == 7) {

					System.out.println("���7�ı����ͺ�7������" + i);
				}

			}

		}

	}
}
