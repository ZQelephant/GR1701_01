package com.duhuiyoua;

import java.util.Scanner;

//�Ӽ�������10�����������5����
public class Thirdly {
	public static void main(String[] args) {
		Scanner az = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = az.nextInt();
			
		}
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
		System.out.println(a[8]);
		System.out.println(a[9]);
		System.out.println(a[10]);
	}

}
