package com.gaojie.qhit01;

import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��27�� ����3:37:00
 */
public class QueenFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "���� ");
			a[i] = sc.nextInt();
		}
		for (int i = (a.length - 5); i < a.length; i++) {
			System.out.println("��" + i + "����Ϊ��" + a[i]);

		}
		sc.close();
	}
}
