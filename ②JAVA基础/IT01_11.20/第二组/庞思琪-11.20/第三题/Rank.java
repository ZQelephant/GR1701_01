package com;

import java.util.Scanner;

/**
 * @author ���� E-mail:271406@163.com
 * @date ����ʱ�䣺2017��11��20�� ����8:25:48
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Rank {
	public static void main(String[] args) {
		// ������������x,y,z���������������С���������
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
		System.out.println("˳��Ϊ" + c + ">" + b + ">" + a);

	}

}
