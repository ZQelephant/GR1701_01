package com.zk.qhit;

import java.util.Scanner;

public class Judge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����i");
		int i = sc.nextInt();
		if (i > 0) {
			System.out.println(i + "������");
		} else if (i < 0) {
			System.out.println(i + "�Ǹ���");
		} else {
			System.out.println();
		}
		sc.close();
	}
}
