package com.gj.qhit;

import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��24�� ����7:31:07
 */
public class Test1 {public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("����������С��");
	
	Double i = sc.nextDouble();
	Double g = sc.nextDouble();
	
	if (i==g) {
		
		System.out.println(i+"="+g);

	} else {
		System.out.println(i+"!="+g);
	}

	sc.close();

}
}


