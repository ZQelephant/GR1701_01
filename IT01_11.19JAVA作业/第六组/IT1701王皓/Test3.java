package com.wanghao.qhit01;

/**
 * ���ߣ���� E-mail:954610522@qq.com 
 * 
 * ����ʱ�䣺2017��11��18�� ����20:42:06
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
