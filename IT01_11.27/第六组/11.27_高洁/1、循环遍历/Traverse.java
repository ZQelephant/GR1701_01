package com.gaojie.qhit01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��27�� ����3:00:34
 */
public class Traverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "������");
			a[i] = sc.nextInt();
		}
		
			System.out.println(Arrays.toString(a));
		

		sc.close();
	}

}
