package com.zk.qhit;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��С��i:");
		double i = sc.nextDouble();
		System.out.println("�������һ��С��j:");
		double j = sc.nextDouble();
		if (i > j) {
			System.out.println("����С�����жϵĽ��Ϊ��" + i + ">" + j);
		} else if (i < j) {
			System.out.println("����С�����жϵĽ��Ϊ��" + i + "<" + j);
		} else {
			System.out.println("����С�����жϵĽ��Ϊ��" + i + "=" + j);
		}
		sc.close();
	}
}
