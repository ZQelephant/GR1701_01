package com.Job04;

import java.util.Scanner;

public class t2 {
	//4 �Ӽ�������1~7�����֣����������1��
	//���������һ�����������2����������ڶ�........���������7,
	//�����������(��switch)

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("������һ�����֣�");
		int H = sc.nextInt();
		
		switch (H) {
		case 1:
			System.out.println("����������һ��");
			break;
		case 2:
			System.out.println("���������ڶ���");
			break;
		case 3:
			System.out.println("��������������");
			break;
		case 4:
			System.out.println("�����������ģ�");
			break;
		case 5:
			System.out.println("�����������壡");
			break;
		case 6:
			System.out.println("��������������");
			break;
		case 7:
			System.out.println("�����������գ�");
			break;			
		default:
			break;
		}	
		
		
		
		
		
	}
}
