package com.wjh;

import java.util.Arrays;
import java.util.Scanner;

public class DigitGroup3 {

	public static void main(String[] args) {
		// �Ӽ�������10�����������5����
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "����");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (i < 5) {
				continue;
			}
			System.out.print("������ĺ�5�������ǣ�"+a[i]+"  ");
		}
		System.out.print("������������ǣ�");
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
