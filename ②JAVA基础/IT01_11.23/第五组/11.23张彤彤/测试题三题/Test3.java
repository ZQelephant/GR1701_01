package com.gj.qhit;

import java.util.Scanner;

/**
 * ���ߣ���ͮͮ 
 * 
 * ����ʱ�䣺2017��11��23�� ����10:53:19
 */
public class Test3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N <= 10000) {
			for (int i = 1; i > 0; i++) {

				if (N / 10 == 0) {
					System.out.println(i);
					break;
				} else {
					N = N / 10;
				}

			}

		} else {
			System.out.println("������Χ");

		}
	}

}
