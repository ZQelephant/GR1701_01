package com;

/**
 * @author ���� E-mail:271406@163.com
 * @date ����ʱ�䣺2017��11��13�� ����7:04:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
// ������1~100���ۼ�ֵ����Ҫ��������λΪ3����
public class Sum {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i < 101; i ++ ) {
			if(i%10==3)
				continue;
			sum += i;
			
		}
		System.out.println(sum);
	}

}
