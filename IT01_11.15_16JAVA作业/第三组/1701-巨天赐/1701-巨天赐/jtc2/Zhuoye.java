package jtc;

import java.util.Scanner;

/** 
 * @author  ����:jtc
 * @date    ����ʱ�䣺2017��11��16�� ����5:57:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Zhuoye {
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