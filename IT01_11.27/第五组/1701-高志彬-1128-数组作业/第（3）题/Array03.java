package com.gzz.arrays;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����7:26:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Array03 {
	public static void main(String[] args) {
		//3 �Ӽ�������10�����������5����
		/*int []a={5,4,68,2,46,48,62,48,244,42};
		System.out.println("����������Ϊ��");
		
		for (int i = 5; i < a.length/2; i++) {
			System.out.println("a["+(i+1)+"]=" +a[i]);
		}
		*/
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];						
		for (int i = 0; i < a.length; i++) {			
			System.out.println("�������" + (i + 1) + "����:");			
			a[i] = sc.nextInt();						
		}
		// ����		
		System.out.println(Arrays.toString(a));			
		System.out.println("��������ǣ�");	
		for (int i = 5; i<10; i++) {		
			
			System.out.println("a[" + i + "]=" + a[i]);
			
		}	
	}

}
