package com.sxl;

import java.util.Arrays;

public class SumMaxMin02 {
	// 2 ����һ����������{5,9,12,45,18,30}��
	// Ҫ���ӡ������������Ԫ��֮�ͣ�
	// ����ӡ�����ֵ����Сֵ��

	public static void main(String[] args) {
		int[] a = { 5, 9, 12, 45, 18, 30 };
		// ��ʼ���ͣ����ֵ����Сֵ�ĵı���
		int sum = 0;
		int max = a[0];
		int min = a[0];
		//forѭ�������if�ж����ֵ����Сֵ
		for (int i = 0; i < a.length; i++) {
			if (max > a[i]) {
				max = a[i];
			}
			if (min < a[i]) {
				min = a[i];
			}
			sum += a[i];
		}
		System.out.println("����Ԫ�غͣ�" + sum);
		System.out.println("Ԫ�ص����ֵ��" + max);
		System.out.println("Ԫ�ص���Сֵ��" + min);

	}
}
