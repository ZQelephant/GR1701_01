package com.gj.qhit;

import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��23�� ����10:46:56
 */
public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int i = sc.nextInt();
		int a = 0;
		if (i > 99 && i < 1000) {
			a = i / 10 % 10;
			System.out.println(a);

		} else {
			System.out.println("������һ����λ��");
		}

		sc.close();

	}
}