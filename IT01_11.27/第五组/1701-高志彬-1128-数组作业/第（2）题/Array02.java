package com.gzz.arrays;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����6:40:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Array02 {
	//2 ����һ����������{5,9,12,45,18,30}��
	//Ҫ���ӡ������������Ԫ��֮�ͣ�����ӡ�����ֵ����Сֵ��
	public static void main(String[] args) {
		int []a={5,9,12,45,18,30};		
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("���ֵ��" + max);
		System.out.println("��Сֵ��" + min);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];			
		}
		System.out.println("Ԫ��֮�ͣ�"+sum);
		
		
		
		
		
		
		
	}

}
