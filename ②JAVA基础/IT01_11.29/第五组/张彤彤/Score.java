package com.zhangtongtong.qhit;

import java.util.Arrays;

/**
 * ���ߣ���ͮͮ E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��29�� ����2:22:51
 */
public class Score implements IGrade {

	@Override
	public void info() {
		System.out.println("������������ѧ���ɼ�����ϵͳ������������");
		System.out.println("[1]����������룺Sum");
		System.out.println("[2]�������ֵ�����룺MAN");
		System.out.println("[3]������Сֵ�����룺MIN");
		System.out.println("[4]����ƽ���������룺Average");
		System.out.println("[5]�����������룺sort");
		System.out.println("[6]���鿴���������������룺Number60");
		System.out.println("[7]���鿴���������룺Info");
		System.out.println("[8]���˳������룺ESC");

	}

	@Override
	public double Sum(double[] d) {
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;
	}

	@Override
	public double MAN(double[] d) {
		double MAN = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > MAN) {
				MAN = d[i];
			}
		}

		return MAN;
	}

	@Override
	public double MIN(double[] d) {
		double MIN = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] < MIN) {
				MIN = d[i];
			}
		}

		return MIN;
	}

	@Override
	public double Average(double[] d) {
		double Average = 0;

		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		Average = sum / d.length;

		return Average;
	}

	@Override
	public void sort(double[] d) {
		double b = 0;
		for (int i = 0; i < d.length - 1; i++) {
			for (int j = 0; j < d.length - 1; j++) {
				if (d[j] > d[j + 1]) {
					b = d[j];
					d[j] = d[j + 1];
					d[j + 1] = b;
				}
			}
		}
		System.out.println(Arrays.toString(d));

	}

	@Override
	public int Number60(double[] d) {
		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] < 60) {
				sum += 1;
			}
		}
		return sum;
	}

	@Override
	public void Info(double[] d) {
		System.out.println(Arrays.toString(d));

	}

}
