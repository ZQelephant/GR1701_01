package com.ztt;

import java.util.Scanner;


public class Question09 {
	public static void main(String[] args) {
		System.out.println("1.�����Եھ��⣩-->��һ��");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��N��ȷ����Χ");
		int N = sc.nextInt();

		if (N > 10000) {
			System.out.println("�������ֵ���ڷ�Χ֮�ڣ����������룡");
		} else {
			for (int i = 1; i < N; i++) {
				if (i % 7 == 0
						&& (i / 1000 == 7 
						|| i / 100 % 10 == 7
						|| i / 10 % 10 == 7 
						|| i % 10 == 7)) {

					System.out.println(i);
				}
			}
		}
	}

}
