package com.zk.qhit.statictest;

import java.util.Scanner;

public class HuiWenShu {
	public static void main(String[] args) {
		
		//һ��5λ�����ж����ǲ��ǻ�������
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����λ����");		
		int i = sc.nextInt();

		 if(i/10000==i%10&&i/1000%10==i/10%10){
			System.out.println("������");
		}
		else{
			System.out.println("����");
		}
		
				
		
	}

}
