package machao;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����8:40:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZhengshuN {
	public static void main(String[] args) {
//��дJAVA����,ͨ������̨����һ������N,(N������10000),���
//����7�ı����Ͱ���7����.		
		System.out.println("������һ��������10000����:");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q <= 10000) {
			for (int a = 1; a <= q; a++) {
				if (a % 7 == 0 || a / 1000 == 7 || a / 100 == 7 || a / 10 == 7) {
					System.out.println(a);
				}
			}
		} else {
			System.out.println("������һ����ȷ����!");
		}
		sc.close();
	}
}
}
