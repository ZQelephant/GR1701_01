package wangshenliang;

import java.util.Scanner;

/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��16�� ����1:50:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Ball {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������aΪ����");
		double a = sc.nextInt();
		double h = a / 2;  
		
		int i = 0;
		System.out.println("������bΪ����");
		int b= sc.nextInt();
		for (i = 1;i< b;i ++){
		a = a + h * 2;   
		h = h / 2;       
		}
		System.out.println("��" + i + "����ؾ���" + a +"��"); 
		System.out.println("��" + i + "�η���" + h + "��");
		}
		}
	


