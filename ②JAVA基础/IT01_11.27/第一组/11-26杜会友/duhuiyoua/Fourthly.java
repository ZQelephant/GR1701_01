package com.duhuiyoua;

import java.util.Scanner;

//�Ӽ�������10����������2�����6��������
//��4�����8�����������ԭ����10������
//�Լ��������10����
public class Fourthly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�����" + (i + 1) + "����");
			a[i] = sc.nextInt();
			a[2] = a[6];
			a[4] = a[8];

		}
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
		System.out.println(a[8]);
		System.out.println(a[9]);
		System.out.println(a[10]);
	}

}
