package zhangtongtong;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		
		// ����һ�������ж�������������
		
		System.out.println("������һ������");
		
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();

		if (a > 0) {
			
			System.out.println("����Ϊ����");
			
		} else if (a == 0) {
			
			System.out.println("����Ϊ0");
			
		} else {
			
			System.out.println("����Ϊ����");
		}

	}
}
