package jkl;

import java.util.Scanner;

public class Diyiti {

	//�Ӽ��̽���ʮ�����������������У�Ȼ��ѭ�����������е�Ԫ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]a=new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"����");
			a[i]=sc.nextInt();
			
		}
		for (int j = 0; j < a.length; j++) {
			
			System.out.println(a[j]);
		}
	}
}
