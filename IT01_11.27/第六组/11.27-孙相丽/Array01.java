package com.sxl;

import java.util.Scanner;

//1 �Ӽ��̽���10�����������������У�
//Ȼ��ѭ�����������е�Ԫ��
public class Array {

	public static <Scaner> void main(String[] args) {
		// �Ӽ��̽���10�����������������У�
		Scanner sc = new Scanner(System.in);
		int[] i = new int[10];
		// ѭ�����������е�Ԫ��
		for (int j = 0; j < i.length; j++) {
			i[j] = sc.nextInt();
			i[j] = j + 1;
			System.out.println("a[" + j + "]=" + i[j]);
   
		}

		sc.close();
	}

}
