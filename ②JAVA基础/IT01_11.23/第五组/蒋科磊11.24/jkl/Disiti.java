package com.jkl;

import java.util.Scanner;

public class Disiti {

	public static void main(String[] args) {

		System.out.println("������һ��1~7��������");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("��������ȷ�����֣�");
			break;
		}
	}
}
