package com;

import java.util.Scanner;


public class Palindrome {public static void main(String[] args) {
//һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
  Scanner sc=new Scanner(System.in);	
    System.out.println("����һ����λ��");	
   int i=sc.nextInt();
   if(i<10000||i>99999){
	   System.out.println("�����������������");
   }else if(i/10000==i%10&&i/1000%10==i/10%10){
	   System.out.println("���������");
   }else{
	   System.out.println("������ǻ�����");
   }


	
}

	
	
	
	
}


