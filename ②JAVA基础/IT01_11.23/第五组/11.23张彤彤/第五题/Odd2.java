package com.gaojie.qhit01;

/**
 * ���ߣ���ͮͮ
 * 
 * ����ʱ�䣺2017��11��23�� ����8:29:24
 */
public class Odd2 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i;
			}

		i++;}
		System.out.println("1��100֮���������Ϊ��" + sum);
	}

}
