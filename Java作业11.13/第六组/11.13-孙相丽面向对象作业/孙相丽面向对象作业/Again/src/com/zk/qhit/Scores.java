package com.zk.qhit;
import java.util.Scanner;

public class Scores {
	
	/**
	* ʱ�䣺11.10
	* ���ڣ���
	* ���磺6��00
	* �ص㣺����һ
	* ��Ŀ������
	*/
			public static void main(String[] args) {
		
			/**3��������Ԫ�����������Ƕ�׻�ѡ��ṹ����ɴ��⣺
			* ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
			*���������(a>b)?a:b��������������Ļ������ӡ�
			*/
			Scanner sc = new Scanner(System.in);
			System.out.println("������ͬѧ��ѧϰ�ɼ�");
			int scores = sc.nextInt();
			
			
			if(scores >= 90){
				System.out.println("��ͬѧ��ѧϰ�ɼ��ȼ��ǣ�A");
			}else if(scores>= 60){
				System.out.println("��ͬѧ��ѧϰ�ɼ��ȼ��ǣ�B");
			}else{
				System.out.println("��ͬѧ��ѧϰ�ɼ��ȼ��ǣ�C");
			}sc.close();
		}
			
	}

	
	
	
	
	
	
	
	

