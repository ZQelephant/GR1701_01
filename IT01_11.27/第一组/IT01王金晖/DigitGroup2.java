package com.wjh;

public class DigitGroup2 {

	public static void main(String[] args) {
		// ����һ����������{5,9,12,45,18,30}��Ҫ���ӡ������������Ԫ��֮�ͣ�
		// ����ӡ�����ֵ����Сֵ��
		int[] a = { 5, 9, 12, 45, 18, 30 };
		int max = a[0];
		int min = a[0];
		int sum = 0;
		for (int i = 0; i < a.length - 1; i++) {
			sum += a[i];
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}

		}
		System.out.println("�ۼ�֮���ǣ�" + sum);
		System.out.println("���ֵ�ǣ�" + max);
		System.out.println("��Сֵ�ǣ�"+min);
	}

}
