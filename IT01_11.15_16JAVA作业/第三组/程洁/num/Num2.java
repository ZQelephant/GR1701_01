package num;

import java.util.Scanner;

public class Num2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����k:");
		float k = sc.nextFloat();
		System.out.println("������ڶ�����l:");
		float l = sc.nextFloat();

		System.out.print("�������������:");
		System.out.println((k > l) ? "k>l" : (k == l) ? "k=l" : "k<l");

		sc.close();
	}
}