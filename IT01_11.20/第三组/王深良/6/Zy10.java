package wangshenliang;
/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��21�� ����8:15:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Zy10 {
	public static void main(String[] args) {
		System.out.println("�˷��ھ���");
		int a = 1;

		do {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while (b <= a);
			a++;
			System.out.println();
		} while (a <= 9);
	}

}
