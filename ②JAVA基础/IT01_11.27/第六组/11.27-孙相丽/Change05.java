package com.sxl;

import java.util.Scanner;

public class Change05 {
//5 �Ӽ�������10����������2�����6����������4�����8�����������ԭ����10�������Լ��������10����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "����");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + "\t");

		}
		int i = a[1];
		a[1] = a[5];
		a[5] = i;

		int n = a[3];
		a[3] = a[7];
		a[7] = n;

		System.out.println();
		for (int h = 0; h< a.length; h++) {
			System.out.print(a[h] + " ");
		}

	}

}
