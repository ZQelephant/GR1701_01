package com.qhit.Work;

public class Quzi8 {

	public static void main(String[] args) {
		int x = 0;
		for (int a = 100; a <= 1000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println("��λΪ6������3������:" + a);
				x++;
			}
		}
		System.out.println("����" + x + "��");
	}
}
