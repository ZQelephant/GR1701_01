package Grade;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��29�� ����8:23:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Iscore {

	void info();
	double Sum(double[] d);
	double Max(double[] d);
	double Min(double[] d);
	double Average (double[] d);
	double []Sort(double[]  d);
	int numberNot60(double[] d);
	
}
