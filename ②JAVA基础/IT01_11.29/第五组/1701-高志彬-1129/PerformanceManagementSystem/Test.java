package com.Grade;

import java.util.Scanner;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��29�� ����8:56:31
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] a = new double[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "����");
			a[i] = sc.nextInt();
		}
		Score score = new Score();
		score.info();
		//double[] a = { 55, 88, 47, 95, 86, 78, 64, 88, 61, 35 };

		String s;
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("��������һ��ָ��󰴻س���ִ�У�");
			s = sc.next();
			switch (s) {	
			case "Sum":
				double sum = score.sum(a);
				System.out.println("�ܳɼ�Ϊ��" + sum);
				break;
			case "Max":
				double max = score.max(a);
				System.out.println("���ֵ�ǣ�" + max);
				break;
			case "Min":
				double min = score.min(a);
				System.out.println("��Сֵ�ǣ�" + min);
				break;
			case "Sort":
				double[] sort=score.sort(a);
				System.out.println("����" + sort);
				break;
			case "Avarage":
				double avarage = score.avarage(a);
				System.out.println("ƽ��ֵ�ǣ�"+avarage);
				break;
			case "Not":
				double[] not = score.sort(a);
				System.out.println("������������"+not);
				break;
			case "Info":
				System.out.println("�ɼ�������");
				score.scoreInfo(a);
				break;
			case "Exit":
				isQuit = false;
				break;

			default:
				break;
			}
		}
		System.out.println("�ټ�~");

	}
}
