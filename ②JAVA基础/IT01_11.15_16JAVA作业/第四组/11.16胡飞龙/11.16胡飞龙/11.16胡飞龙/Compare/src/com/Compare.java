package com;

import java.util.Scanner;



class Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		double i = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("�������������");
		double k = sc1.nextInt();
		if (i > k) {
			System.out.println(i+">"+k );

		}
		if (i < k) {
			System.out.println(i+"<"+k);
		}

	}

}
