package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����10:07:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe1120_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = 0;
		
		if(a>b){
			a=x;
			a=b;
			b=x;
		}if(a>c){
			a=x;
			a=c;
			c=x;
		}if(b>c){
			b=x;
			b=c;
			c=x;
		}
		System.out.println(a+" "+b+" "+c);
	}
}
