package com.wjh;

import java.util.Arrays;
import java.util.Scanner;

public class DigitGroup5 {

	// �Ӽ�������10����������2�����6����������4�����8�����������ԭ����10������
	// �Լ��������10����

	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			int b;
			a[i] = sc.nextInt();
			System.out.println(Arrays.toString(a));

			b = a[1];
			a[1] = a[5];
			a[5] = b;

			b = a[3];
			a[3] = a[7];
			a[7] = b;

		}
		System.out.println(Arrays.toString(a));
	}
}
