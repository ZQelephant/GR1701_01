package com.saj;

import java.util.Arrays;

public class Score implements Isore {

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("------����------");
		System.out.println("[1]�����ֵ������Max");
		System.out.println("[2]����Сֵ������Min");
		System.out.println("[3]��ƽ��ֵ������Average");
		System.out.println("[4]��С��������������Sort");
		System.out.println("[5]���������Sum");
		System.out.println("[6]�������������Number");
		System.out.println("[7]�鿴ȫ���ɼ�������Examine");
		System.out.println("[8]�˳�ϵͳ������Exit");

	}

	@Override
	public double max(double[] d) {
		// TODO Auto-generated method stub
		double max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > max) {
				max = d[i];

			}
		}

		return max;
	}

	@Override
	public double min(double[] d) {
		// TODO Auto-generated method stub
		double min = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] < min) {
				min = d[i];

			}
		}

		return min;
	}

	@Override
	public double average(double[] d) {
		// TODO Auto-generated method stub
		double sum = 0;
		double average = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
			average = sum / d.length;

		}

		return average;
	}

	@Override
	public double[] sort(double[] d) {
		// TODO Auto-generated method stub
		
	
	for (double j = 0; j < d.length-1; j++) {
      double temp;
	for (int i = 0; i < d.length-1; i++) {
		if(d[i]<d[i+1]){
			temp=d[i];
			d[i]=d[i+1];
			d[i+1]=temp;
		}
		}	
		
	}
		return d;
	}

	@Override
	public double sum(double[] d) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;
	}

	@Override
	public int numberNot60(double[] d) {
		// TODO Auto-generated method stub
		int b = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] < 60) {
				b++;

			}

		}
		return b;
	}

	void examine(double[] d) {
		System.out.println(Arrays.toString(d));

	}

}
