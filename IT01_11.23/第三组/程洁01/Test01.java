package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("����������С����");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println((a==b)?"�������":"���������");
	}
}
