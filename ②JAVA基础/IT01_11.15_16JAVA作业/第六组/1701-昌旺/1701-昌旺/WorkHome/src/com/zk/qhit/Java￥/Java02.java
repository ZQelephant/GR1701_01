package com.zk.qhit.Java��;

import java.util.Scanner;


public class Java02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�������һ�����֣�");	
		
		float i =sc.nextInt();
		
		System.out.println("������ڶ������֣�");	
		
		float j =sc.nextInt();
		
		if(i>j){
			System.out.println(i+">"+j);
		}else if(i<j){
			System.out.println(i+"<"+j);
		}else{
			System.out.println(i+"="+j);
		}
		
		
	}

}
