package num;

import java.util.Scanner;

public class Num1 {
	public static void main(String[] args) {
		
		System.out.print("������һ����:");
		Scanner sc = new Scanner(System.in);
		float k = sc.nextFloat();
		
		if (k > 0) {
			System.out.println("�������������!");
		} else if (k == 0) {
			System.out.println("�����������!");
		} else {
			System.out.println("��������Ǹ���!");
		}
		sc.close();
	}
}