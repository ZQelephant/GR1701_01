package Practice_1129;

import java.util.Arrays;

/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Scor implements IScor {

	private double x;

	@Override
	public void info() {
		System.out.println("-----�ɼ�����ϵͳ-----");
		System.out.println("[1]���������Sum");
		System.out.println("[2]�����ֵ������Max");
		System.out.println("[3]����Сֵ������Min");
		System.out.println("[4]��ƽ��ֵ������Average");
		System.out.println("[5]����������Score");
		System.out.println("[6]�󲻼�������������Not");
		System.out.println("[7]�鿴�ɼ�������Info");
		System.out.println("[8]�˳�������Exit");

	}

	@Override
	public double sum(double[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum+=x[i];	
		}
		return sum;
	}

	@Override
	public double max(double[] x) {
		int max = (int) x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i]>max) {
				max = (int) x[i];
			}
		}
		return max;
	}

	@Override
	public double min(double[] x) {
		int min = (int) x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i]<min) {
				min = (int) x[i];
			}
		}
		return min;
	}

	@Override
	public double average(double[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum+=x[i];	
		}
		int average = 0;
		average = sum/x.length;
		return average;
	}

	@Override
	public void sort(double[] x) {
		for (int i = 0; i < x.length-1; i++) {
			for (int j = 0; j < x.length-1; j++) {
				if(x[j]<x[j+1]){
					double temp = x[j+1];
					x[j+1]=x[j];
					x[j]=temp;
				}
			}	
		}System.out.println(Arrays.toString(x));
		
	}

	@Override
	public int numberNot60(double[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i]<60) {
				count++;
			}
		}
		return count;
	}

	void Infor(double [] x){
		System.out.println(Arrays.toString(x));
	}
}
