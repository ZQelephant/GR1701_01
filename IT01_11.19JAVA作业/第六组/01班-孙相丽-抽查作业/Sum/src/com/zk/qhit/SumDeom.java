package com.zk.qhit;

/**
 * @author 
 * @date ����ʱ�䣺2017��11��18�� ����4:21:35
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class SumDeom {
	public static void main(String[] args) {
		// ���һǧ��������8�ı���֮��
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 8 == 0) {
				sum += i;
			}

		}

		System.out.println(sum);
	}

}
