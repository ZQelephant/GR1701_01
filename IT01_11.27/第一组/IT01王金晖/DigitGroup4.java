package com.wjh;

import java.util.Arrays;
import java.util.Scanner;

public class DigitGroup4 {

	//�Ӽ�������10���������Ӵ�С����
	public static void main(String[] args) {
		int[] a= new int[10];
		//����
		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������"+(i+1)+"����");
			a[i] =sc.nextInt();
			
		}System.out.print("������������ǣ�");
		System.out.println(Arrays.toString(a));
		//����
		for (int j = 0; j< a.length-1; j++) {
		    for (int k = 0; k < a.length-1; k++) {
				int l;
				if (a[k]<a[k+1]) {
					l=a[k];
					a[k]=a[k+1];
					a[k+1]=l;
				}
		    	
			}	
		}System.out.print("�����");
		System.out.println(Arrays.toString(a));
		
	}
}
