package com;

/**
 * @author ���� E-mail:271406@163.com
 * @date ����ʱ�䣺2017��11��17�� ����7:11:57
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Aliquant {
	public static void main(String[] args) {

		int i = 1;
		do {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}i++;

		} while (i <= 1000);

	}

}
