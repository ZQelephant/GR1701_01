package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����10:16:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe1120_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int x = sc.nextInt();
		
		if (x % 10 == x / 10000&&x %10000/1000 == x % 100 / 10){
			System.out.println(x+"��һ��������");
		}else{
			System.out.println(x+"���ǻ�����");
		}
	}
}
