package com.Grade;

import java.util.Arrays;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��29�� ����8:27:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Score implements IScore {

	@Override
	public void info() {
		System.out.println("-----�ɼ�����ϵͳ-----");
		System.out.println("(1).���������Sum��");
		System.out.println("(2).�����ֵ������Max��");
		System.out.println("(3).����Сֵ������Min��");
		System.out.println("(4).��ƽ��ֵ������Avarage��");		
		System.out.println("(5).�󲻼�������������Not");
		System.out.println("(6).�鿴ȫ���ɼ�������Info��");	
		System.out.println("(7).����������Sort��");
		System.out.println("(8).�˳�ϵͳ������Exit��");		
	}
	//���
	@Override
	public double sum(double[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			
		}		
		
		return sum;
	}
//���ֵ
	@Override
	public double max(double[] a) {
		double max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}		
		return max;
	}
//��Сֵ
	@Override
	public double min(double[] a) {
		double min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}		
		return min;
	}
//ƽ��ֵ
	@Override
	public double avarage(double[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		int avarage =0;
		avarage = sum/a.length;		
		return avarage;
	}
//����
	@Override
	public double[] sort(double[] a) {
		boolean isSort=false;
		for (int i = 0; i < a.length-1; i++) {
			int temp;
			isSort=true;
			for (int j = 0; j < a.length-1; j++) {
				if (a[i]>a[i+1]) {
					temp=(int) a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					isSort=false;
				}
				if (isSort) {
					break;
				}				
			}			
		}
		System.out.println(Arrays.toString(a));
		return a;

	}

	@Override
	public int NumberOffailures(double[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<60) {
				count++;
			}
		}
		return 0;
	}
	
	//�鿴ȫ���ɼ�
	void scoreInfo(double[] a){
		System.out.println(Arrays.toString(a));
		
	}

}
