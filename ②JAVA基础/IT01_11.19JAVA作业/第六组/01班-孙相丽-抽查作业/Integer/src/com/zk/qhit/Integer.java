package com.zk.qhit;

/**
 * @author 
 * @date ����ʱ�䣺2017��11��18�� ����5:16:35
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class Integer {

	public static void main(String[] args) {
		// ���λ��Ϊ6�����ܱ�3������3λ�����ж���
		int number = 0;
		for (int i = 100; i <= 1000; i++) {
			if (i % 3 == 0 && i % 10 == 6) {
				System.out.print(i + "\t");
				number++;
			}
		}

		System.out.println();
		System.out.println(number);

	}
}
