package gaojie;

import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��13�� ����4:40:07
 */
public class Grade1113 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ɼ���");
		int i = input.nextInt();

		if (i >= 90) {
			System.out.println("A");
		}
		
		if (i >= 60 && i <= 89) {
			System.out.println("B");
		}
		
		if (i < 60 && i >= 0) {
			System.out.println("C");
		}
		

	}

}
