package com.saj;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();

		if (a < 10) {
			System.out.println("����Ϊһλ��");

		} else if (a < 100) {
			System.out.println("����Ϊ��λ��");

		}

		else if (a < 1000) {
			System.out.println("����Ϊ��λ��");

		}

		else if (a < 10000) {
			System.out.println("����Ϊ��λ��");

		} else if (a == 10000) {
			System.out.println("����Ϊ��λ��");
		}

	}

}
