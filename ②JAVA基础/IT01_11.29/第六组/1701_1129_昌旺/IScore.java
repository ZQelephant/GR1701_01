/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��29�� ����8:20:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package changwang;

public interface IScore {
	//�˵�����
	void info();
	//�ܷ�
	double sum(double[] a);
	//���ֵ
	double max(double[] a);
	//��Сֵ
	double min(double[] a);
	//ƽ��ֵ
	double average(double[] a);
	//С��60����
	double not(double[] a);
	//��С��������
	double[] ppp(double[] a);
	
	
	
	

}
