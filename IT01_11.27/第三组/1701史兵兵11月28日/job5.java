package job;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��28�� ����7:11:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class job5 {
	public static void main(String[] args) {
		//�Ӽ�������10����������2�����6����������4�����8��
		//���������ԭ����10�������Լ��������10����
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];

		int b = 0;
		int c = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "����\t ");
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (i == 1) {
				b = a[1];
				a[1] = a[5];
				a[5] = b;

			}
			if (i == 3) {
				c = a[3];
				a[3] = a[7];
				a[7] = c;
			}

		}
		System.out.println(Arrays.toString(a));

		sc.close();

		
	}

}
