package machao;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����8:22:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PalindromeNumber {
	//һ��5λ�����ж����ǲ��ǻ�������
	//��12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
	public static void main(String[] args) {
		System.out.print("������һ����λ����");
		Scanner sc = new Scanner(System.in);
		int num = sc .nextInt();
		
		if(num/10000==num%10&&num/1000%10==num/10%10){
			System.out.println("����������ǻ�������");
		}else{
			System.out.println("������������ǻ�������");
		}
		sc.close();
	}
}


