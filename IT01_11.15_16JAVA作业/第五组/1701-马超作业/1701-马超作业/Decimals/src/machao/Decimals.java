package machao;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��17�� ����1:44:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Decimals {
    public static void main(String[] args) {
    	//��дJAVA����ͨ������̨����һ�����֣��ж�����С����С��
    	//������жϽ��
    	Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����s:");
		float s = sc.nextFloat();
		System.out.println("������ڶ�����f:");
		float f = sc.nextFloat();

		System.out.println((s > f) ? "s>f" : (s == f) ? "s=f" : "s<f");

		sc.close();
	}
}	
		

		
	


	

