package wangshenliang;
/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��14�� ����7:18:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Perfec {
	
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {

			int tem = 0;

			for (int j = 1; j < i; j++) {

				if (i % j == 0) 

					tem += j;
			}

			if (tem == i) {

				System.out.println(i);

			}
		}
	}

}
