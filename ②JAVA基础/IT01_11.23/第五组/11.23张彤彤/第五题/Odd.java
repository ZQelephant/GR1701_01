package com.gaojie.qhit01;

/**
 * ���ߣ���ͮͮ
 * 
 * ����ʱ�䣺2017��11��23�� ����8:22:54
 */
public class Odd {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
				sum += i;

			}

		}
		System.out.println("1��100֮���������Ϊ��" + sum);
	}

}
