package com.Job01;

import java.util.Scanner;

public class Java203 {
	public static void main(String[] args) {
		//3.��дJAVA����ͨ������̨����һ������N��N<=10000��,
		//�жϸ������Ǽ�λ��������������
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count =0;
		
		if(N<0 || N>10000){
			System.out.println("���������������������롣");
		}
		else{
			while (N>0|| N<=10000) {
				
				N=N/10;
				
				count++;
				
			}
			
			System.out.println("���������"+count+"λ��");
			
		}
		
	}
			
}
