package machao;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����8:13:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sort {
public static void main(String[] args) {
	//������������x,y,z���������������С���������	
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = sc.nextInt();
		System.out.println("�������һ������");
		int y = sc.nextInt();
		System.out.println("�������һ������");
		int z = sc.nextInt();
		
		int u[]={x,y,z};
		for (int a = 1; a < u.length; a++) {
			for (int b = 0; b < u.length; b++) {
				if (u[a] < u[b]) {
					int c = u[a];
					u[a] = u[b];
					u[b] = c;
				}
			}
		}
		for (int c = 0; c < u.length; c++) {
			System.out.print(u[c]);
			if (c < 2) {
				System.out.print("<");
			}
		}
		sc.close();
	}
}


