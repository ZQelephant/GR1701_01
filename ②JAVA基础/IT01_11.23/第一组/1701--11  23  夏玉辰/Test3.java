package com.xyc;

import java.util.Scanner;

public class Test3 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������10000����");
		int N=sc.nextInt();
		if(N<10){
			System.out.println("��һλ��");
		}else if(N<100){
			System.out.println("�Ƕ�λ��");
		}else if(N<1000){
			System.out.println("����λ��");
		}else if(N<10000){
			System.out.println("����λ��");
		}else if(N==100){
			System.out.println("����λ��");
		}
		
	}
}
