package num;

import java.util.Scanner;

/*���ߣ�������
 *E-mail��15539919713@163.com
 */
public class Num1 {
	public static void main(String[] args) {
		
		System.out.print("������һ����:");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		
		if (a > 0) {
			System.out.println("�������������!");
		} else if (a == 0) {
			System.out.println("�����������!");
		} else {
			System.out.println("��������Ǹ���!");
		}
		sc.close();
	}
}