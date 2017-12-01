/**
 * 
 */
package com.sxl;

import java.util.Arrays;

/**
 * @author Administrator
 *
 */
public class Score implements IScores {

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#info()
	 */
	public void help() {
		System.out.println("����");
		System.out.println("���������sum");
		System.out.println("�����ֵ������Max");
		System.out.println("����Сֵ������Min");
		System.out.println("��ƽ��ֵֵ������Average");
		System.out.println("��������������Sort");
		System.out.println("�г�����������������Not");
		System.out.println("�˳�������Exit");
		System.out.println("�г��ɼ�������Info");
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#sum(double[])
	 */
	@Override
	public double sum(double[] d) {
		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];

		}
		// TODO Auto-generated method stub
		return sum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#max(double[])
	 */
	@Override
	public double max(double[] d) {
		// TODO Auto-generated method stub
		double max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (max < d[i]) {
				max = d[i];
			}

		}
		return max;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#min(double[])
	 */
	@Override
	public double min(double[] d) {
		// TODO Auto-generated method stub
		double min = d[0];
		for (int i = 0; i < d.length; i++) {
			if (min > d[i]) {
				min = d[i];
			}

		}
		return min;
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#average(double[])
	 */
	@Override
	public double average(double[] d) {
		// TODO Auto-generated method stub
		return sum(d)/d.length;
		
	}
		

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#numberNot60(double[])
	 */
	@Override
	public int numberNot60(double[] d) {
		int count = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] < 60) {
				count++;
			}
		}
		// TODO Auto-generated method stub
		return count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#sort(double[])
	 */
	@Override
	public double[] sort(double[] d) {
		// TODO Auto-generated method stub
		double temp;
		for (int i = 0; i < d.length-1; i++) {
			for (int j = 0; j < d.length-1; j++) {
				if (d[j] > d[j + 1]) {
					temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		System.out.println("�Ӵ�С˳��" + Arrays.toString(d));
		return d;
	}

	@Override
	public void info(double[] d) {
		// TODO Auto-generated method stub
	System.out.println(Arrays.toString(d));

	}
}
