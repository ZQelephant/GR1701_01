package wangshenliang;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��28�� ����7:29:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Five {
	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		
		int a[] =new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.print("�������"+(i+1)+"����:");
			a[i]=sc.nextInt();
			
	}
		for (int i = 0; i < a.length-1; i++) {
			int b;
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]<a[j+1]) {
					b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
