package num;

import java.util.Scanner;

/*���ߣ�������
 *E-mail��15539919713@163.com
 */
public class Num2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����a:");
		float a = sc.nextFloat();
		System.out.println("������ڶ�����b:");
		float b = sc.nextFloat();

		System.out.print("�������������:");
		System.out.println((a > b) ? "a>b" : (a == b) ? "a=b" : "a<b");

		sc.close();
	}
}