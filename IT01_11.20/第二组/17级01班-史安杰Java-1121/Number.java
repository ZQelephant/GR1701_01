package com.zk.qhit.statictest;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�����һ������");
	int a = sc.nextInt();
	System.out.println("����ڶ�������");
	int b = sc.nextInt();
	System.out.println("�������������");
	int c = sc.nextInt();
	int s = 0;
	if (a > b) {
		s = a;
		a = b;
		b = s;
	}
	if (a > c) {
		s = a;
		a = c;
		c = s;

	}
	if (b > c) {
		s = b;
		b = c;
		c = s;
	}
	System.out.println( c + ">" + b + ">" + a);

}
}

