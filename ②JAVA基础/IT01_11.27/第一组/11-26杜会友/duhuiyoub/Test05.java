package com;

import java.util.Scanner;


public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һ����");
		int a = sc.nextInt();
		System.out.println("����ڶ�����");
		int b = sc.nextInt();
		System.out.println("�����������");
		int c = sc.nextInt();
		int d = 0;
		if (a > b) {
			d = a;
			a = b;
			b = d;
		}
		if (a > c) {
			d = a;
			a = c;
			c = d;
		}
		if (b > c) {
			d = b;
			b = c;
			c = d;
		}
		if (c > a) {
			d = c;
			c = a;
			a = d;
		}
		System.out.println(c + "<" + b + "<" + a);
	}
}