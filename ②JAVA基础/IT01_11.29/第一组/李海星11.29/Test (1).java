package com.Grade;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double[] t = { 85, 45, 78, 65, 32, 15, 48, 99, 87, 56 };
		Scort ss = new Scort();
		Scanner sc = new Scanner(System.in);
		String s;
		boolean is = true;
		// while
		ss.info();
		while (is) {
			System.out.println("������һ��ָ�� �س���ִ��");
			s = sc.next();

			switch (s) {
			case "sum":
				double sum = ss.sum(t);
				System.out.println(sum);
				break;
			case "Exit":

				is = false;
				break;
			case "average":
				int x = (int) ss.average(t);
				System.out.println("ƽ�����ǣ�" + x);

				break;
			case "min":
				double c = ss.min(t);
				System.out.println("��Сֵ�ǣ�" + c);
				break;
			case "flunk":

				int a = ss.flunk(t);
				System.out.println("�������ѧ��������" + a);

				break;
			case "max":
				double b = ss.max(t);
				System.out.println("���ֵ�ǣ�" + (b));
				break;
			case "info":
				ss.scortinfo(t);
				break;

			case "sort":
                double[] q =ss.sort(t);
                System.out.println(t);
				break;
			default:
				break;
			}

		}
		System.out.println("�ټ���  ��ӭ�´�ʹ��");
	}
}
