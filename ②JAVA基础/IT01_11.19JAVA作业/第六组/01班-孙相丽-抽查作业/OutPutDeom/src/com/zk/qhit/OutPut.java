package com.zk.qhit;

/**
 * @author 
 * @date ����ʱ�䣺2017��11��18�� ����4:49:51
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class OutPut {

	public static void main(String[] args) {
		// 1��10���е�������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ���֣������������
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (sum > 20) {
				break;
			}

		}
		System.out.println(sum);
	}
}
