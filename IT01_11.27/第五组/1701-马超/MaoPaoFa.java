package MaChao;

import java.util.Arrays;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����6:57:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class MaoPaoFa {

	public static void main(String[] args) {
	 int [] a={85,72,92,64,76,81};
	
		int temp;
		for (int l = 0; l < a.length; l++) {
	
		}
		for (int j = 0; j < a.length-1; j++) {
			for (int i = 0; i < args.length - 1; i++) {

				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					
				}
			}
		}System.out.println(Arrays.toString(a));
		}
	

	}
