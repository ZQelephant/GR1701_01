package wangshenliang;

import java.util.Scanner;

/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��14�� ����7:16:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Grade {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ���");
		int i = sc.nextInt();

		if (i >= 90) 
			System.out.println("A");
		if (i >= 60 && i <= 89) 
			System.out.println("B");
		if (i < 60 && i >= 0) 
			System.out.println("C");
		
		

	}

	}


