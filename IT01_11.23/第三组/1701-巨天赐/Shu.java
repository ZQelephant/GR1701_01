package jtc;

import java.util.Scanner;

/** 
 * @author  ����:jtc
 * @date    ����ʱ�䣺2017��11��16�� ����7:00:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Shu {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("����һ����");
	int a = sc.nextInt();
	
	if(a>0){
		System.out.println("����������Ϊ��"+a);
	}
	else if(a<0) {
		System.out.println("����ĸ���Ϊ��"+a);
	}	
	else{
		System.out.println("�Ȳ�������Ҳ���Ǹ���");
	}
		
	}
	
	
}

