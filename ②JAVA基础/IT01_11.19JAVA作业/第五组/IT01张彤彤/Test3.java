package com.zhangtongtong.qhit01;

/**
 * ���ߣ���ͮͮ E-mail:1346528669@qq.com �绰:15036836634
 * 
 * ����ʱ�䣺2017��11��18�� ����11:57:06
 */
public class Test3 {
	public static void main(String[] args) {

		System.out.println("1000�������е�����Ϊ��");
		
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			
			if (i % 2 != 0) {
				System.out.print(i + "\t");
				sum += 1;
				
				if (sum % 5 == 0) {
					System.out.println();
				}
			}
		}

	}

}
