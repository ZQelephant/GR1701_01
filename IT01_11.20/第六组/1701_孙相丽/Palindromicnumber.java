package com.zk.qhit;

import java.util.Scanner;

public class Palindromicnumber {

	public static void main(String[] args) {
		// 4��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
		Scanner sc = new Scanner(System.in);
		long i=sc.nextLong();
		int unit = (int)(i % 10);
			int myriabit = (int)(i / 10000);
			int decade = (int)(i/10%10);
			int kilobit = (int)((i%10000)/1000);
			if ((unit == myriabit) && decade == kilobit) {
				System.out.println(i + "������");
			}else{
				System.out.println(i+"���ǻ�����");
			}
		sc.close();
	}

	}


