package com.grade;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:271406@163.com
 * @date    ����ʱ�䣺2017��11��29�� ����8:57:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {public static void main(String[] args) {
	double []d={98,78,54,66,33,22,11,444,99,};
	Score score=new Score();
	score.info();
	Scanner sc=new Scanner(System.in);
	String s;
	boolean isExit=true;
	while (isExit) {
		System.out.println("����ָ��");
		s=sc.next();
		switch (s) {
case "Max":
		double j=score.max(d);
		System.out.println(j);
	break;
case "Min":
	double k=score.max(d);
	System.out.println(k);
	break;
case "Average":
	double y=score.max(d);
	System.out.println(y);
break;
case "Sum":
	double h=score.sum(d);
		System.out.println(h);	
			break;
case "Not":
	double f=score.numberNot60(d);
	break;	
case "Info":
		score.scoreInfo(d);	
			break;
		case "Exit":
			isExit=false;
			break;

		default:
			break;
		}
		
		
	}System.out.println("�ټ�");
	
	
}

}
