package glh;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����7:23:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ChouKao_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		double a = sc.nextDouble();
		System.out.println("������ڶ�������");
		double b = sc.nextDouble();
		if (a > b) {
			System.out.println("���Ϊa > b");
		} 
		if (a < b) {
			System.out.println("���Ϊa < b");
		}else{
			System.out.println("���Ϊa = b");
		}
	}
}
