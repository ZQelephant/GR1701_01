package HEL;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWork1127_3 {

	public static void main(String[] args) {
		//�Ӽ�������10�����������5����
		Scanner sc = new Scanner(System.in);
		int []a = new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "���� ");
			a[i] = sc.nextInt();
		}
		for (int i = (a.length - 5); i < a.length; i++) {
			System.out.println("��" + i + "����Ϊ��" + a[i]);

		}
		sc.close();
	}
}


