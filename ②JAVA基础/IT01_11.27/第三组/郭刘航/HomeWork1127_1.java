package GLH;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return
 * @function
 */
public class HomeWork1127_1 {

	public static void main(String[] args) {
		
		//�Ӽ��̽���10�����������������У�Ȼ��ѭ�����������е�Ԫ��
		Scanner sc = new Scanner(System.in);
		int []a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("���飺");
		for (int i = 0; i < a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
