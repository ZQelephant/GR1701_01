package com.sxl;
import java.util.Scanner;

public class Seven01 {

	
		    static boolean isMulriple(int n ,int m){
			return (n%m==0)?true:false;
		}
		    static boolean isContain(int n,int m){
			boolean isCon = false;
			int temp = n;
			while (temp>0){
				if(temp%10==m){
					isCon=true;
					break;
				}else{
					temp=temp/10;
				}
			}
			return isCon;
		}
			
	public static void main(String[] args) {
		/**
		 * ��������N(N<=10000),�������7�ı����Ͱ���7������
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������10000������");
	int  l = sc.nextInt();
		if(l>10000){
			System.out.println("���ֲ��ܴ���10000");
		}else{
			for(int i = 7;i<=l;i++){
				if(isMulriple(i,7) || isContain(i,7)       ){
					System.out.println(i);
				}
			}
		}
		
		sc.close();
	}
	}

	
	
	
	

