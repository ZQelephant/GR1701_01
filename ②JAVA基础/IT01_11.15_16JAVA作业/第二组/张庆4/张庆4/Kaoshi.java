package zhangqing;

import java.util.Scanner;

/* @author  ���ߣ�����  E-mail1738041626@QQ.com
 * @date    ����ʱ�䣺2017��11��15�� ����6:31:33
 * @Tel: 1438438 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Kaoshi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("Ϊ����" + a);
		} else if(a<0){
			System.out.println("����" + a);
		}else{
			System.out.println("�Ȳ�Ϊ����Ҳ��Ϊ����");
		}

	}
}
