package HEL;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWork1127_1 {

	public static void main(String[] args) {
		
		//�Ӽ��̽���10�����������������У�Ȼ��ѭ�����������е�Ԫ��
		Scanner sc = new Scanner(System.in);
		int []a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("���飺");
		for (int i = 0; i < a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
