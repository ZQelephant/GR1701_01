package com.sxl;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		if (i == j) {
			System.out.println("���");

		} else {
			System.out.println("�����");
		}

		sc.close();
	}

}
