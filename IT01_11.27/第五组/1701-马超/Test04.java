package machao;

import java.util.Arrays;
import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��28�� ����7:34:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test04 {

	public static void main(String[] args) {
		//�Ӽ�������10����,���ڶ��������������,���ĸ��͵�8������,
		//���ԭ����10����,�Լ��������10����.
		Scanner sc=new Scanner(System.in);
		int[]a=new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("����"+(i+1)+"����");
			a[i]=sc.nextInt();
		}System.out.println(Arrays.toString(a));
		int L=0;
		int W=0;
		for (int i = 0; i < a.length; i++) {
			if (i==1) {
				L=a[1];
				a[1]=a[5];
				a[5]=W;
			}if (i==3) {
				W=a[3];
				a[3]=a[7];
				a[7]=L;
			}
		}System.out.println(Arrays.toString(a));
	}

		
	}

