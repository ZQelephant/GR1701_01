package glh;

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
public class ZuoYe1115_3 {
	public static void main(String[] args) {
		//һ���h�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
	    //�����£������� ��n�����ʱ�������������ף���n�η�����ߣ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������h�ĸ߶�");
		double h = sc.nextDouble();
		
		double h1 = h/2;
		int i = 0;
		for (i = 2;i < 10;i++){
			h = h + h1 * 2;
			h1 = h1/2;
		}
		System.out.println(i+"����ؾ���"+h+"��");
		System.out.println("��"+i+"�η���"+h1+"��");
	}

}
