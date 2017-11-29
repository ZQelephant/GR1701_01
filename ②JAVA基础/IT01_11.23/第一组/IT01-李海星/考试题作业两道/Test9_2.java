package com.lhx.qhit01;

import java.util.Scanner;

import org.omg.IOP.MultipleComponentProfileHelper;


public class Test9_2 {

	static boolean multiple = false;

	public static boolean isMultiple(int n, int m) {
		if (n % m == 0) {
			multiple = true;

		} else {
			multiple = false;
		}

		return multiple;
	}

	static boolean include = false;

	public static boolean isInclude(int q, int w) {
		int r = q;
		while (r > 0) {
			if (r % 10 == w) {
				include = true;
				break;

			} else {
				r = r / 10;
				include = false;
			}

		}

		return include;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������һ��������10000����N");

		int N = sc.nextInt();

		System.out.println("N��Χ������7�ı����Ͱ���7��������");

		if (N > 10000) {
			System.out.println("������Χ");
		}

		else {
			for (int i = 1; i <= N; i++) {
				if (isMultiple(i, 7) && isInclude(i, 7)) {
					System.out.println(i);
				}
			}

		}
		sc.close();
	}

}
