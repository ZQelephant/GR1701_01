package com.duhuiyou;

import java.util.Arrays;

public class FANG implements Operatingsystem {

	@Override
	public void info() {
		System.out.println("------�ɼ�����ϵͳ------");
		System.out.println("[1]���������1");
		System.out.println("[2]�����ֵ������2");
		System.out.println("[3]����Сֵ������3");
		System.out.println("[4]����ƽ��ֵ������4");
		System.out.println("[5]����������5");
		System.out.println("[6]�鿴�ɼ�������6");
		System.out.println("[7]�鿴������������7");
		System.out.println("[8]�˳�������8");
	}
	/*void info();
	double sum(double[] d);
	double max(double[] d);
	double min(double[] d);
	double average(double[] d);
	double[]sort(double[] d);
	int numberNot60(double[] d);*/

	@Override
	public double sum(double[] d) {
		int sum = 0;
		for (int i = 0; i < d.length; i++) {
		sum+=d[i];
		}
		return 0;
	}

	@Override
	public double max(double[] d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double min(double[] d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double average(double[] d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double[] sort(double[] d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numberNot60(double[] d) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	void look(double[] d){
		System.out.println(Arrays.toString(d));
		
	}

}
