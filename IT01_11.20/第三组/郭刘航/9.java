package glh;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����6:30:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Exam_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����N(N<10000)");
		int N = sc.nextInt();
		System.out.println("N��Χ������7�ı����Ұ���7�������±�ʾ��");
		if(N < 10000){
		for (int a = 1;a <= N;a++){
			if((a%7==0)
					&&((a%10 == 7)||(a/10%10 == 7)
							||(a/100%10 == 7)||(a/10000 == 7))){
				System.out.println(a);
			}
		}
	}
	if (N >= 10000 || N <= 0){
		System.out.println("��Χ֮��");
	}
}
}
