package guo;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ChouKao_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		double a = sc.nextDouble();
		System.out.println("������ڶ�����");
		double b = sc.nextDouble();
		
		if(a > b){
			System.out.println("a > b");
		}
		else{
			System.out.println("a < b");
		}
	}


}
