package com.zk.qhit;

import java.util.Scanner;

/**
 * time:11.16 week:Thursday weather:sun author:sun site:machine room
 */
public class MaxTest {
	public static void main(String[] args) {

		/**
		 * 6 �Ӽ�������4����������д����ʵ�ֶ���4 �������Ӵ�С��˳����������� a b a c a d b c b d c d
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("��������a");
		int a = sc.nextInt();
		System.out.println("��������b");
		int b = sc.nextInt();
		System.out.println("��������c");
		int c = sc.nextInt();
		System.out.println("��������d");
		int d = sc.nextInt();
		int i;
		if (a < b) {
			i = a;
			a = b;
			b = i;
		}
		if (a < c) {
			i = a;
			a = c;
			c = i;
		}
		if (a < d) {
			i = a;
			a = d;
			d = i;
		}
		if (b < c) {
			i = b;
			b = c;
			c = i;
		}
		if (b < d) {
			i = b;
			b = d;
			d = i;
		}
		if (c < d) {
			i = c;
			c = d;
			d = i;
		}
		System.out.println("�ĸ���c�Ӵ�С��˳��Ϊ��" + a + "" + b + "" + c + "" + d);
		sc.close();
	}

}
