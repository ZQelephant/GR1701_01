package com.Grade;

import java.util.Arrays;

public class Scort implements ISorce {

	@Override
	public void info() {
		System.out.println("-----�ɼ�ϵͳ�İ�����Ϣ-----");
		System.out.println("[1]���������sum");
		System.out.println("[2]���ֵ������max");
		System.out.println("[3]��Сֵ������min");
		System.out.println("[4]ƽ����������average");
		System.out.println("[5]�鿴������ɼ�������flunk");
		System.out.println("[6]����������sort");
		System.out.println("[7]�鿴ȫ���ɼ�������info");
		System.out.println("[8]�˳�ϵͳ������Exit");
	}

	@Override
	public double max(double[] d) {
		double t = 0;
		for (int i = 0; i < d.length - 1; i++) {

			if (d[i] < d[i + 1]) {
				d[i] = d[i + 1];
				t = d[i];
			}
		}
		return t;
	}

	@Override
	public double min(double[] d) {
		double t = 0;

		for (int i = 0; i < d.length - 1; i++) {

			if (d[i] > d[i + 1]) {
				d[i] = d[i + 1];
				t = d[i];
			}
		}
		return t;
	}

	@Override
	public double sum(double[] d) {
		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;
	}

	@Override
	public double average(double[] d) {
		double sum = 0;
		double t = 0;
		for (int i = 0; i < d.length; i++) {
			sum = sum + d[i];
			t = sum / d.length;
		}
		return t;
	}

	void scortinfo(double[] d) {
		System.out.println(Arrays.toString(d));
	}

	@Override
	public int flunk(double[] d) {
		int count = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] < 60) {
				count++;
			}
		}
		return count;
	}

	@Override
	public double[] sort(double[] d) {
		int c = 0;
		for (int i = 0; i < d.length - 1; i++) {
			for (int j = 0; j < d.length - 1; j++) {
				if (d[j] > d[j + 1]) {
					c = (int) d[j];
					d[j] = d[j + 1];
					d[j + 1] = c;

				}
			}
			System.out.println(Arrays.toString(d));
		}

		
		return d;
	}
}
