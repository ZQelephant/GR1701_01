package com;

/**
 * @author ���� E-mail:271406@163.com
 * @date ����ʱ�䣺2017��11��17�� ����7:36:40
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Eight {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 100; i < 1000; i++) {
			if (i % 10 == 6 && i % 3 == 0) {
				System.out.print(i + "  ");
				j++;
			}
		}
		System.out.println();
		System.out.println("����Ϊ��" + j);
	}

}
