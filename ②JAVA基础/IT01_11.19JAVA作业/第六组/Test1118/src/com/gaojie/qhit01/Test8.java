package com.gaojie.qhit01;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��18�� ����12:57:39
 */
public class Test8 {
	public static void main(String[] args) {

		System.out.println("��λ��Ϊ6���ܱ�3�����������±�ʾ");
		int sum = 0;
		for (int i = 100; i < 1000; i++) {

			if ((i % 10 == 6) && (i % 3 == 0)) {

				System.out.print(i + "\t");
				sum += 1;
				
				if (sum % 6 == 0) {
					
					System.out.println();

				}
			}
		}
	}

}
