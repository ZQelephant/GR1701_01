/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��22�� ����10:25:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package changwang;

public class Test10 {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			}
			System.out.println();
			a++;

		}
	}

}
