package test;

/*Author��������
 *E-mail��15539919713@163.com
 */
public class TestOfFor {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += (i % 2 != 0) ? i : 0;
		}
		System.out.println("1~100֮�������ĺ�Ϊ" + sum);
	}
}