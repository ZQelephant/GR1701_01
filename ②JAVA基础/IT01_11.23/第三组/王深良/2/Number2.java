/**
 * @author ���� ������E-mail:793708547@QQ.com
 * @date ����ʱ�䣺2017��11��24�� ����1:16:09
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Number2 {
	public static void main(String[] args) {
		int i = 1;
		int a = 0;
		while (i < 101) {
			if (i % 2 == 0)
				continue;
			else {
				a += i;

			}
		}System.out.println(a);
	}
}
