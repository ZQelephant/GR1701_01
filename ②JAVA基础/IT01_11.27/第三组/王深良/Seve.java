package wangshenliang;

import java.util.Scanner;

/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��28�� ����7:21:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Seve {
	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		
		int a[] =new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.print("�������"+(i+1)+"����:");
			a[i]=sc.nextInt();
			
		
	}
		for (int i = 5; i < a.length; i++) {
			System.out.print(a[i]+ "   ");
			
		}
	}
}
