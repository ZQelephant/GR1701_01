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
		for (int h = 1; h <= 1000; h++) {
			if (h % 8 == 0) {
				sum += h;
			}
		}
		System.out.println(sum);

	}

}
