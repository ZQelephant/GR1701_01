package xiayuchen;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {

		System.out.println("������һ��������10000����:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i <= 10000) {
			for (int a = 1; a <= i; a++) {
				if (a % 7 == 0 || a / 1000 == 7 || a / 100 == 7 || a / 10 == 7) {
					System.out.println(a);
				}
			}
		} else {
			System.out.println("������һ����ȷ����!");
		}
		sc.close();
	}
}