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

		int a = 1;
		do {
			if (a % 5 == 0 && a % 3 == 0) {
				System.out.println(a);
			}a++;

		} while (a <= 1000);

	}

}
