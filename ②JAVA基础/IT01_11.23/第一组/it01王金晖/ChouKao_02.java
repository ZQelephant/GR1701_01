package jtc;

import java.util.Scanner;


public class ChouKao_02 {

	public static void main(String[] args) {
		System.out.println("������һ����λ����");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("������ʮλ����"+i / 10%10);
	}
}
