package com.gaojie.qhit;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��29�� ����2:10:59
 */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score score = new Score();
		System.out.println("������ѧ���ɼ���");
		double[] d = new double[5];
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}
		score.info();
		boolean c = true;
		String s;
		while (c) {
			s = sc.next();

			switch (s) {
			case "Sum":
				double su = score.Sum(d);
				System.out.println(su);
				System.out.println("��������һ��ָ��");
				break;
			case "MAN":
				double M = score.MAN(d);
				System.out.println(M);
				System.out.println("��������һ��ָ��");
				break;
			case "MIN":
				double m = score.MIN(d);
				System.out.println(m);
				System.out.println("��������һ��ָ��");
				break;
			case "Average":
				double av = score.Average(d);
				System.out.println(av);
				System.out.println("��������һ��ָ��");
				break;
			case "sort":
				score.sort(d);
				System.out.println("��������һ��ָ��");
				break;
			case "Number60":
				int nu = score.Number60(d);
				System.out.println(nu);
				System.out.println("��������һ��ָ��");
				break;
			case "Info":
				score.Info(d);
				System.out.println("��������һ��ָ��");
				break;
			case "ESC":
				c = false;

				break;

			}

		}
		System.out.println("�ټ�");
		sc.close();
	}
}
