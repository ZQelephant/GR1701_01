/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��29�� ����8:36:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package changwang;

import java.util.Arrays;

public class Score implements IScore {

	@Override
	public void info() {
		System.out.println("-----�ɼ���ѯϵͳ-----");
		System.out.println("[1]�������sum");
		System.out.println("[2]���ֵ����max");
		System.out.println("[3]��Сֵ����min");
		System.out.println("[4]ƽ��ֵ����average");
		System.out.println("[5]����������������not");
		System.out.println("[6]�˳�������Exit");
		System.out.println("[7]��С��������������ppp");

	}

	@Override
	public double sum(double[] a) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			c += a[i];
		}

		return c;
	}

	@Override
	public double max(double[] a) {
		double max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	@Override
	public double min(double[] a) {
		double min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	@Override
	public double average(double[] a) {
		int av = 0;
		for (int i = 0; i < a.length; i++) {
			av += a[i];
		}
		return av;
	}

	@Override
	public double not(double[] a) {
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 60) {
				x++;
			}
		}
		return x;
	}

	public double[] ppp(double[] a) {
		double n = 0;
		for (int j = 0; j < a.length - 1; j++) {

			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					n = a[i];
					a[i] = a[i + 1];
					a[i + 1] = n;
				}
			}
		}System.out.println(Arrays.toString(a));
		return a;
	}
}
