package jtc;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����7:29:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ChouKao_02 {

	public static void main(String[] args) {
		System.out.println("������һ����λ����");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("������ʮλ����"+i / 10%10);
	}
}
