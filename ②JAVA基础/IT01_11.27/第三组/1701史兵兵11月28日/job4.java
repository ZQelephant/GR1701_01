package job;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��28�� ����7:10:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class job4 {
	public static void main(String[] args) {
		//�Ӽ�������10���������Ӵ�С����
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];

		int b = 0;

		for (int k = 0; k < a.length; k++) {
			System.out.println("�������" + (k + 1) + "������ \t");
			a[k] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

		for (int j = 0; j < a.length - 1; j++) {

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {

					b = a[i];

					a[i] = a[i + 1];

					a[i + 1] = b;

				}

			}

		}
		System.out.println("��С���������Ϊ��");
		System.out.println(Arrays.toString(a));

		sc.close();

	}

}
