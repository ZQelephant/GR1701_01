package com.gzz.arrays;

import java.util.Arrays;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����8:03:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class MaoPao {
	//6.ð�ݷ�
	public static void main(String[] args) {
		
		int []a={54,8,9,4,53,21,45,48};
		
		for (int i = 0; i < a.length-1; i++) {
			int temp;
			boolean isSort=false;
			for (int j = 0; j < a.length-1; j++) {
				if (a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					isSort=true;
				}
				if (isSort) {
					break;
				}
		
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println("��С����"+Arrays.toString(a));
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
