package com.gzz;

import java.util.Scanner;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��22�� ����8:20:28
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Do2 {

	static boolean isDivision(int x, int y) {
		return (y / x == 0) ? true : false;
	}

	static boolean isContainNum(int x, int y) {
		boolean isCotain = false;
		int M = x;
		while (M > 0) {
			if (M % 10 == y) {
				isCotain = true;
				break;
			} else {
				M = M / 10;
			}
		}
		return isCotain;
	}

	public static void main(String[] args) {
		System.out.println("1.�����Եھ��⣩-->�ڶ���");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��N��ȷ����Χ");
		int N = sc.nextInt();
		if (N > 10000) {
			System.out.println("�������ֵ���ڷ�Χ֮�ڣ����������룡");
		} else {
			for (int i = 7; i <= N; i++) {
				if (isContainNum(i, 7) && isDivision(i, 7)) {

					System.out.println(i);
				}
			}
		}
	}

}
