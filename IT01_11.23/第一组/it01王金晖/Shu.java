package jtc;

import java.util.Scanner;

public class Shu {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("����һ����");
	int a = sc.nextInt();
	
	if(a>0){
		System.out.println("����������Ϊ��"+a);
	}
	else if(a<0) {
		System.out.println("����ĸ���Ϊ��"+a);
	}	
	else{
		System.out.println("�Ȳ�������Ҳ���Ǹ���");
	}
		
	}
	
	
}

