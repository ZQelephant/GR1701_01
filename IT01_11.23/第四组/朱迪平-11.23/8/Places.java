package com;

import java.util.Scanner;

public class Places {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("����һ��������10000����");
	int a=sc.nextInt();
	if (a<10) {
		System.out.println("��λ��һλ��");
	}
	else if (a<100) {
		System.out.println("��λ�Ƕ�λ��");
	}
	else if (a<1000) {
		System.out.println("��λ����λ��");
	}
	else if (a<10000) {
		System.out.println("��λ����λ��");
	}
	else if (a==10000) {
		System.out.println("��λ����λ��");
	}
}

}
