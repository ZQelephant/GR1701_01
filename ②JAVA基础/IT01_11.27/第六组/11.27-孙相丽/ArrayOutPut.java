package com.sxl;

import java.util.Scanner;

public class ArrayOutPut {
	// 3 �Ӽ�������10�����������5����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] i = new int[10];
		for (int j= 0; j < i.length; j++) {
			System.out.println("�������" + (j+1) + "����");
			i[j] = sc.nextInt();
		}
		for (int j = 5; j < i.length; j++) {
			System.out.println(i[j] + " ");

		}

		sc.close();
	}
}