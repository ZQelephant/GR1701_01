package com.Job01;

import java.util.Scanner;

public class Java202 {
	// 2.��дJAVA��������һ����λ�������������ʮλ�Ƕ��٣�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int i = sc.nextInt();

		int shi;
		shi = i % 100 / 10;
		System.out.println("����λ����ʮλ�ϵ������ǣ�");
		System.out.println(shi);

	}

}
