package com.ztt;


public class Question10 {
	public static void main(String[] args) {
		System.out.println("2.�žų˷���whileѭ��ʵ�֣�");

		int i = 1;
		while (i <= 9) {

			int j = 1;
			while (j <= i) {

				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;

			}
			System.out.println();
			i++;
		}
		
		
		System.out.println("2.�žų˷���(forѭ��ʵ��)");
		
		for (int a = 1; a <= 9; a++) {
			
			for (int b = 1; b <= a; b++) {
				
				System.out.print(b+"*"+a+"="+a*b+"\t");
				
			}
			System.out.println();
		}
		
		

	}

}
