package five;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��16�� ����6:59:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Inherit {
	public static void main(String[] args) {
		/**��дJava����ͨ������̨����һ�����֣��жϸ�������
		 * �������Ǹ���������������
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("����������");
		int a=input.nextInt();
		if(a>0){
			System.out.println("������������");
		}else if(a<0){
			System.out.println("�������Ǹ���");
		}
	}

}
