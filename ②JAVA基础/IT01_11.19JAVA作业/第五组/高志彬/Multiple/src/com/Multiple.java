package com;

/**
 * @author ���� E-mail271406@163.com
 * @date ����ʱ�䣺2017��11��17�� ����7:03:20
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Multiple {
	public static void main(String[] args) {

		int sum = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 8 == 0) {
				sum += a;
			}
		}
		System.out.println(sum);

	}

}
