package com.Job01;

import java.util.Scanner;

public class Java201 {
	//1.��дJAVA����ͨ������̨��������С�����ж�����С���Ƿ���ȣ�����������
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("����������С����");
		double i =sc.nextDouble();
		double j =sc.nextDouble();
		System.out.println("����ǣ�");
		if (i<j) {
			System.out.println(i+"<"+j);
		} else if(i>j){
			System.out.println(i+">"+j);
		}else{
			System.out.println(i+"="+j);
		}
		
		
		
		
		
	}

}
