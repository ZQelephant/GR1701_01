package wangshenliang;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��28�� ����7:02:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class one {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a[] =new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"����");
			a[i]=sc.nextInt();
			
			
		}
		System.out.println(Arrays.toString(a));
	}

}
