package com.qhit.Work;

public class Quzi5 {

	public static void main(String[] args) {
		int a = 1;
		do {
			if (a % 5 == 0 || a % 3 == 0) {
				System.out.println("�ܱ�3��5��������:" + a);
			}
			a++;
		} while (a <= 1000);

	}
}
