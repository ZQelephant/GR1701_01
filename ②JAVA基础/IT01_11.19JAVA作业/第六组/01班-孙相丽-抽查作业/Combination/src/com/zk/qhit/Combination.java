package com.zk.qhit;

/**
 * @author 
 * @date ����ʱ�䣺2017��11��18�� ����5:03:53
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class Combination {

	public static void main(String[] args) {
		// ��1,2,3,4,5�����������ȡ�����������г����ǵ�������ϣ������
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i != j) {
					System.out.println(i +" "+ j);
				}
			}
		}

	}
}
