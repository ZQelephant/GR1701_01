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
		for (int i = 1; i <= 1000; i++) {
			if (i % 8 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
