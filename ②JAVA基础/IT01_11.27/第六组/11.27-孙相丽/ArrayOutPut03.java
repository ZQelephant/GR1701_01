package com.sxl;

import java.util.Scanner;

public class ArrayOutPut {
	// 3 �Ӽ�������10�����������5����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int j = 1; j <= 10; j++) {
			int i = sc.nextInt();
			if (j > 5) {
				System.out.println(i);
			}

		}
		sc.close();
	}
}