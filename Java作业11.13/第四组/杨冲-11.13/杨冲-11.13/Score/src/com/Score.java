package com;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:271406@163.com
 * @date    ����ʱ�䣺2017��11��13�� ����6:51:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Score {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("���������");
	int score=sc.nextInt();
	if(score>=90){System.out.println("A");}
	if((score>=60)&&(score<=89)){System.out.println("B");}
	if(score<60){System.out.println("C");}
	
	
	
	
	
}

}
