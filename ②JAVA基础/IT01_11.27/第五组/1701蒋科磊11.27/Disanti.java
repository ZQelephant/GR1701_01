package jkl;

import java.util.Scanner;

public class Disanti {

	public static void main(String[] args) {
		//�Ӽ�������10����������������
		Scanner sc = new Scanner(System.in);
		int [] a=new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"����");
			a[i]=sc.nextInt();
		}
		for (int i = 5; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
