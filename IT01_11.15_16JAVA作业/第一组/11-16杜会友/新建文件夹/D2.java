package java����;

import java.util.Scanner;

import sun.font.EAttribute;

public class D2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("����������С��");
	double a=sc.nextInt();
	double b=sc.nextInt();
	if(a>b){
		System.out.println(a+">"+b);
	}else if(a==b){
		System.out.println(a+"="+b);
	}else {
		System.out.println(a+"<"+b);
		
	}
		
	}
	
}


