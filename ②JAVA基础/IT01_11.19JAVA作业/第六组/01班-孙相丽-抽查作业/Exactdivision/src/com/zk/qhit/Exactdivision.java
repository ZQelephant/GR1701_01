package com.zk.qhit;

/**
 * @author 
 * @date ����ʱ�䣺2017��11��18�� ����4:33:31
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class Exactdivision {

	public static void main(String[] args) {

		// ���һǧ���ڼ��ܱ�5���������ܱ�������������������ʹ��do...whileѭ����
		int i = 1;
		do {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 1000);

	}
}
