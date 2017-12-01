package com.jkl;

public class Score implements IScore {

	@Override
	public void info() {
	System.out.println("-----������ɼ�������Ϣ-------");
	System.out.println("[1]���������sum");
	System.out.println("[2]���ֵ������Max");
	System.out.println("[3]��Сֵ������Min");
	System.out.println("[4]ƽ��ֵ������average");
	System.out.println("[5]����������Sort");
	System.out.println("[6]������������Not");
	System.out.println("[7]�˳�ϵͳ������Exit");
	}

	@Override
	public double sum(double[] d) {
		int sum=0;
		for (int i = 0; i < d.length; i++) {
			sum+=d[i];
		}
		return sum;
	}

	@Override
	public double Max(double[] d) {
		double Max=0;
		for (int i = 0; i < d.length; i++) {
			if(d[i]>Max){
			Max=d[i];
		}
		}
		return Max;
		
	}

	@Override
	public double Min(double[] d) {
		double Min=d[0];
		for (int i = 0; i < d.length; i++) {
			if(d[i]<Min){
				Min=d[i];
			}
		}
		return Min;
	}

	@Override
	public double average(double[] d) {
		double sum=0;
		double average=0;
		for (int i = 0; i < d.length; i++) {
			sum+=d[i];
			average=(sum/(d.length));
		}
		return average;
	}

	@Override
	public double[] sort(double[] d) {
		for (int i = 0; i < d.length-1; i++) {
			for (int j = 0; j < d.length-1; j++) {
				if(d[j]>d[j+1]){
					double sort=d[j];
					d[j]=d[j+1];
					d[j+1]=sort;
			}
			}
		}
		return d;
	}

	@Override
	public int numberNot60(double[] d) {
		int Not=0;
		for (int i = 0; i < d.length; i++) {
			if(d[i]<=60){
				Not++;
			}
		}
		return Not;
	}

}
