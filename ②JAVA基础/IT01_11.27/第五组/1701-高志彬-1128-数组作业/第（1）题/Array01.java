package com.gzz.arrays;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����7:20:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Array01 {
	public static void main(String[] args) {
		//1 �Ӽ��̽���10�����������������У�
		//Ȼ��ѭ�����������е�Ԫ��
		Scanner sc=new Scanner(System.in);
		int []a=new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("������"+(i+1)+"����");
			a[i]=sc.nextInt();
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
		
	}

}
