package Grade;

import java.util.Arrays;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��29�� ����9:31:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Score implements Iscore {
	@Override
	public void info() {
		System.out.println("-----�ɼ�����ϵͳ����-----");
		System.out.println("[1]���������Sum");
		System.out.println("[2]���ֵ������Max");
		System.out.println("[3]��Сֵ������Min");
		System.out.println("[4]ƽ��������Average");
		System.out.println("[5]����������Sort");
		System.out.println("[6]����������������Not");
		System.out.println("[7]�鿴ȫ���ɼ�������info");
		System.out.println("[8]�˳�������Exit");
        System.out.println();
	}

	@Override
	public double[] Sort(double[] d) {
		  for (int i = 0; i < d.length-1; i++) {
			for (int j = 0; j < d.length-1; j++) {
				if (d[j]<d[j+1]) {
					double temp=d[j+1];
					d[j+1]=d[j];
					d[j]=temp;
				}
			}
			return d;
		}
		return d;
	}
	@Override
	public int numberNot60(double[] d) {
           int not=0;
           for (int i = 0; i < d.length; i++) {
			if (d[i]<60) {
				not++;
			}
		}
		
		return not;
	}

	@Override
	public double Sum(double[] d) {

		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;
	}

	@Override
	public double Max(double[] d) {
		double Max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > Max) {
				Max = d[i];
			}
			return Max;
		}
		return Max;
	}

	@Override
	public double Min(double[] d) {
		double Min = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > Min) {
				Min = d[i];
			}
			return Min;
		}
		return Min;
	}	

	@Override
	public double Average(double[] d) {
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum/d.length;
	}	
	void ScoreInfo(double []d){
		System.out.println(Arrays.toString(d));
	}

	public void help() {
		// TODO Auto-generated method stub
		
	}
}
