package com.saj;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"����");
			a[i]=sc.nextInt();
		}
		for (int i = 5; i <a.length ; i++) {
			System.out.println(a[i]);
			
			
		}
		

	}

}
