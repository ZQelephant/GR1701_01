package com.xiayuchen

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];

		int b = 0;

		for (int k = 0; k < a.length; k++) {
			System.out.println("�������" + (k + 1) + "������ \t");
			a[k] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

		for (int j = 0; j < a.length - 1; j++) {

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {

					b = a[i];

					a[i] = a[i + 1];

					a[i + 1] = b;

				}

			}

		}
		System.out.println("��С���������Ϊ��");
		System.out.println(Arrays.toString(a));

		sc.close();
	}

}
