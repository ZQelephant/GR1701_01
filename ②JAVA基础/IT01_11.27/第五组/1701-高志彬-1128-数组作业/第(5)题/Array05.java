package com.gzz.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��27�� ����7:42:24
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Array05 {
	// 5 �Ӽ�������10����������2�����6��������
	// ��4�����8�����������ԭ����10�������Լ��������10����
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Scanner��
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			// forѭ������int������
			System.out.print("�����" + (i + 1) + "��:");
			a[i] = in.nextInt();
		}
		System.out.println(" ");
		System.out.println("ԭ�������飺" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]= " + a[i]);
		}
		System.out.println(" ");
		// ����:
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp;
				if (a[i] != a[j]) {
					temp = a[1];
					a[1] = a[5];
					a[5] = temp;
				}
				if (a[i] != a[j]) {
					temp = a[3];
					a[3] = a[7];
					a[7] = temp;
				}
			}
		}
		System.out.println("�����������" + Arrays.toString(a));

	}

}
