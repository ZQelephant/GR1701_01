package com.grade;

import java.util.Arrays;



public class Score implements Isorce {

	@Override
	public void info() {
		System.out.println("----������Ϣ----");
		System.out.println("[1]���������Sum");
		System.out.println("[2]�����ֵ������Max");
		System.out.println("[3]����Сֵ������Min");
		System.out.println("[4]����������Sort");
		System.out.println("[5]ƽ��ֵ������Average");
		System.out.println("[6]����������Info");
		System.out.println("[7]����������������Not");
		System.out.println("[8]�˳�������Exit");
		
		
		
		
		
		
	}

	@Override
	public double sum(double[] d) {
		double sum=0;
		for (int i = 0; i < d.length; i++) {
			sum+=d[i];
		}
		return sum;
	}

	@Override
	public double max(double[] d) {
		double max=98;
		for (int i = 0; i < d.length; i++) {
			if (d[i]>max) {
				max=d[i];
			}
		}
		return max;
	}

	@Override
	public double min(double[] d) {
		double min=98;
		for (int i = 0;i< d.length; i++) {
			
		
		if (d[i]<min) {
			min=d[i];
		}}
		
		return min;
	}

	@Override
	public double[] sort(double[] d) {
		double temp;
		for (int j = 0; j < d.length-1; j++) {
			
		
		for (int i = 0; i < d.length-1; i++) {
			if (d[i]>d[i+1]) {
				temp=d[i];
				d[i]=d[i+1];
				d[i+1]=temp;
				
			}
		}}
		return d;
	}

	@Override
	public double average(double[] d) {
		double sum=0;
		for (int i = 0; i < d.length; i++) {
			sum+=i;
		}System.out.println(sum/d.length);
		return 0;
	}

	@Override
	public int numberNot60(double[] d) {
		int count=0;
		for (int i = 0; i < d.length; i++) {
			if (d[i]<60) {
				count++;
				
			}System.out.println("����������Ϊ"+count);
		}
		
		
		return count;
	}
	void scoreInfo(double[]d){
		System.out.println(Arrays.toString(d));
	}

}
