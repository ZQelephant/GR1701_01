package there;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��16�� ����3:47:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class New {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������HΪ����");
		double H = sc.nextInt();
		double hn = H / 2; //��һ�η��������߶� 
		
		int i = 0;
		System.out.println("������NΪ����");
		int N = sc.nextInt();
		for (i = 1;i< N;i ++){
		H = H + hn * 2;    //��i����ؾ���������
		hn = hn / 2;       //��i�η����ĸ߶�
		}
		System.out.println("��" + i + "����ؾ���" + H +"��"); 
		System.out.println("��" + i + "�η���" + hn + "��");
     
	}

}
