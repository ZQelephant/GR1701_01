package com.zhangtongtong.qhit01;


public class Test4 {
	public static void main(String[] args) {

		System.out.print("1000��������8�ı���֮��Ϊ��");

		int sum = 0;

		for (int i = 1; i <= 1000; i++) {

			if (i % 8 == 0) {
				sum += i;
			}

		}
		System.out.println(sum);

	}

}
