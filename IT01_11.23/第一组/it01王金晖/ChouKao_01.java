package jtc;

import java.util.Scanner;


public class ChouKao_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		double a = sc.nextDouble();
		System.out.println("������ڶ�������");
		double b = sc.nextDouble();
		if (a > b) {
			System.out.println("���Ϊa > b");
		} 
		if (a < b) {
			System.out.println("���Ϊa < b");
		}else{
			System.out.println("���Ϊa = b");
		}
	}
}
