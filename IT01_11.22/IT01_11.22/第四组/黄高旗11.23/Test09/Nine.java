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
		int b = sc.nextInt();
		if (b> 10000) {
			System.out.println("����");
		} else {
			for (int j = 1; j < b; j++) {
				if (j % 7 == 0 || j %1000 == 7 || j % 100 == 7
						|| j / 10 % 10 == 7 || j % 10 == 7) {

					System.out.println("���7�ı����ͺ�7������" + j);
				}

			}

		}

	}
}
