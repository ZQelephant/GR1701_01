package com.ztt;

import java.util.Arrays;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2017��11��27�� ����7:52:34
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 8, 69, 45, 21, 12, 35, 68, 47, 37 };

		for (int i = 0; i < a.length - 1; i++) {

			int temp;

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j];

					a[j] = a[j + 1];

					a[j + 1] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
