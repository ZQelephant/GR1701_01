package com.sxl;

import java.util.Arrays;

//�Ը����������������
public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 6, 4, 3, 1, 7, 2, 5 };
		// ð�ݷ�
		boolean isSort;
		int temp;
		for (int j = 0; j < a.length - 1; j++) {
			//����˳�����ź�
			isSort = true;
			System.out.println(Arrays.toString(a));
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					isSort = false;//˳��û���ź�
				}
			}
			
			
			if (isSort) {
				break;
			}
		}
	}

}
