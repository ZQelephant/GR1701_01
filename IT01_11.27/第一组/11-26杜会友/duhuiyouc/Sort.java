package com.saf;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// �Ӽ�������10���������Ӵ�С����
		Scanner sc = new Scanner(System.in);
		int[] q = new int[10];

		for (int i = 0; i < q.length; i++) {

			System.out.println("�������" + (i + 1) + "����");
			q[i] = sc.nextInt();
		}
		for (int i = 0; i < q.length - 1; i++) {
			int sum;
			if (q[i] > q[i + 1]) {
				sum = q[i];
				q[i] = q[i + 1];
				q[i + 1] = sum;

			}
		}
		System.out.println(Arrays.toString(q));
	}

}
