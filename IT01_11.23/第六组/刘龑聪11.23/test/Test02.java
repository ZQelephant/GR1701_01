package test;

import java.util.Scanner;

/*Author��������
 *E-mail��15539919713@163.com
 */
public class Test02 {
	public static void main(String[] args) {

		System.out.print("������һ����λ����");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("������ʮλ����" + a / 10 % 10);
	}
}
