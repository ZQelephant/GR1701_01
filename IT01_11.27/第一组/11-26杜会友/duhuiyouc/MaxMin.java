package com.saf;

public class MaxMin {
	// ����һ����������{5,9,12,45,18,30}��
	// Ҫ���ӡ������������Ԫ��֮�ͣ�����ӡ�����ֵ����Сֵ��
	public static void main(String[] args) {
		int[] a = { 5, 9, 12, 45, 18, 30 };
		int max = a[0], min = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("���ֵ="+max);
		System.out.println("��Сֵ="+min);
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("�����="+sum);

	}

}
