package com.grade;

import java.util.Arrays;

/*Author��������
  E-mail��15539919713@163.com
 */
public class Score implements IScore {

	@Override
	public void help() {
		System.out.println("-------�ɼ�����ϵͳ-------");
		System.out.println("[1]�鿴ȫ���ɼ�������Info");
		System.out.println("[2]���������Sum");
		System.out.println("[3]�����ֵ������Max");
		System.out.println("[4]����Сֵ������Min");
		System.out.println("[5]��ƽ��ֵ������Average");
		System.out.println("[6]����������Sort");
		System.out.println("[7]�󲻼�������������Not");
		System.out.println("[8]�˳�������Exit");
		System.out.println("[9]���²鿴����������Help");
		System.out.println();
	}

	@Override
	public double sum(double[] d) {
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;
	}

	@Override
	public double max(double[] d) {
		double max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i]>max) {
				max = d[i];
			}
		}
		return max;
	}

	@Override
	public double min(double[] d) {
		double min = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i]<min) {
				min = d[i];
			}
		}
		return min;
	}

	@Override
	public double average(double[] d) {
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum/d.length;
	}

	@Override
	public double[] sort(double[] d) {
		for (int i = 0; i < d.length-1; i++) {
			for (int j = 0; j < d.length-1; j++) {
				if(d[j]<d[j+1]){
					double temp = d[j+1];
					d[j+1]=d[j];
					d[j]=temp;
				}
			}	
		}
		return d;
	}

	@Override
	public int Not60(double[] d) {
		int not = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i]<60) {
				not++;
			}
		}
		return not;
	}

	void ScoreInfo(double[] d){
		System.out.println(Arrays.toString(d));
	}
}
