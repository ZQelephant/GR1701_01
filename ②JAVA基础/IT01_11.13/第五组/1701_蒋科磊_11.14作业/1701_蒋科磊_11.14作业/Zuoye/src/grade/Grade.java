package grade;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		//ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
		Scanner sc = new Scanner(System.in);
		System.out.println("������ͬѧ�ĳɼ�");
		int grade = sc.nextInt();

		System.out.println(grade >= 90 ? "A" : grade >= 60 ? "B" : "C");

		sc.close();
	}
}
