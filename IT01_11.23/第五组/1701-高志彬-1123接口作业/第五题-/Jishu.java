package com.Job05;

public class Jishu {
	public static void main(String[] args) {
		// 5 ��for �� while���ַ�������1~100֮�������ĺ�
		System.out.println("forѭ��ʵ�֣�");
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
