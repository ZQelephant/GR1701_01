package com.ztt;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2017��11��28�� ����7:42:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 9, 12, 45, 18, 30 };

		int Max = a[0];

		int Min = a[0];

		int Sum = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > Max) {

				Max = a[i];
			}

			if (a[i] < Min) {

				Min = a[i];
			}

			Sum += a[i];
		}

		System.out.println("���ֵ�ǣ�" + Max);

		System.out.println("��Сֵ�ǣ�" + Min);

		System.out.println("�ܺ��ǣ�" + Sum);
	}

}
