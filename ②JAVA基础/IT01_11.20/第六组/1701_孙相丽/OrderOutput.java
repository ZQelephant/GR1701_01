package com.zk.qhit;

import java.util.Scanner;

public class OrderOutput {

	public static void main(String[] args) {
		// ������������x,y,z���������������С���������
		Scanner sc = new Scanner(System.in);
		System.out.println("������x=");
		int x = sc.nextInt();

		System.out.println("������b=");
		int y = sc.nextInt();

		System.out.println("������c=");
		int z = sc.nextInt();
		int c;

		if (x < y) {
			c = x;
			x = y;
			y = c;
		}
		if (x < z) {
			c = x;
			x = z;
			z = c;
		}
		if (y < z) {
			c = y;
			y = z;
			z = c;
		}
		System.out.println(��С����˳�������" + z + "\t"
				+ y + "\t" + x);

		sc.close();
	}

}
