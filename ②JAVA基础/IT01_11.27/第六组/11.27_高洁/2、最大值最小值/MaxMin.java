package com.gaojie.qhit01;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��27�� ����3:16:42
 */
public class MaxMin {

	public static void main(String[] args) {
		int[] a = { 5, 9, 12, 45, 18, 30 };

		int sum = 0;
		int Max = 0;
		int Min = 0;

		for (int i = 0; i < a.length; i++) {

			sum += a[i];
			Max = 5;
			Min = 5;

			if (a[i] > Max) {
				Max = a[i];
			}
			if (a[i] < Min) {
				Min = a[i];

			}

		}

		System.out.println("����ĺ�Ϊ��" + sum);
		System.out.println("��������ֵΪ��" + Max);
		System.out.println("�������СֵΪ��" + Min);

	}

}
