package ccom.cjgl;

import java.util.Arrays;

public class Score implements Iscore {

	@Override
	public void info() {
		System.out.println("*******�ɼ��������*******");
		System.out.println("[1]��������� Sum");
		System.out.println("[2]���ֵ������Max");
		System.out.println("[3]��Сֵ������Min");
		System.out.println("[4]ƽ��ֵ������Average");
		System.out.println("[5]����������Sort");
		System.out.println("[6]����������������Not");
		System.out.println("[7]�鿴�ɼ�������Info");
		System.out.println("[8]�˳�������Exit");
	}

	@Override
	public double sum(double[] c) {
		
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum +=c[i];
		}
		return sum;
	}

	@Override
	public double max(double[] c) {
		double max = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i]>max) {
				max=c[i];
			}
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double min(double[] c) {
		double min = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i]<min) {
				min= c[i];
			}
		}
		return 0;
	}

	@Override
	public double average(double[] c) {
		double sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += c[i];
		}
		return sum/c.length;
	}

	@Override
	public double[] sort(double[] c) {
		for (int i = 0; i < c.length-1; i++) {
			for (int j = 0; j < c.length-1; j++) {
				if (c[j]>c[j+1]){
					double temp = c[j+1];
					c[j+1] = c[j];
					c[j] = temp;
				}
		}
	}
		return c;
		
	}

	@Override
	public int numberNot60(double[] c) {
		return 0;
	}

	void scoreInfo(double[] c){
		System.out.println(Arrays.toString(c));
	}
}
