package com.zk.qhit;

import java.util.Scanner;

/**
 * @author 
 * @date ����ʱ�䣺2017��11��18�� ����5:36:45
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class Seven {
	public static void main(String[] args) {
		// ͨ������̨����һ����N��N������10000�����������7�ı����Ͱ���7������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������10000������");
		int N = sc.nextInt();
		if (N > 10000) {
			System.out.println("���ֲ��ܴ���10000");
		} else {
			for (int i = 1; i < N; i++) {
				if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7
						|| i / 100 == 7 || i / 1000 == 7) {
					System.out.println(i);
				}

			}
		}

		sc.close();
	}

}
