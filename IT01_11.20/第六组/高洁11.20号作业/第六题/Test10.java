package com.gaojie.qhit01;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��18�� ����1:21:38
 */
public class Test10 {
	public static void main(String[] args) {
		System.out.println("�žų˷��� do whileѭ����ʾ����");
		
		int i = 1;

		do {
			int g = 1;
			
				do {
					System.out.print(i + "*" + g + "=" + i * g + "  ");
					g++;
				} while (g <= i);

			System.out.println();
			i++;
			} while (i <= 9);

	}

}
