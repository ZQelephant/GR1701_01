package machao;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//��дJAVA����ͨ������̨��������С����
		//�ж�����С���Ƿ���ȣ�������жϽ����
		System.out.println("����������С��");
		Scanner sc=new Scanner(System.in);
		double w = sc.nextDouble();
		double s = sc.nextDouble();
		
		System.out.println((w==s)?"�������":"���������");
	}
}
