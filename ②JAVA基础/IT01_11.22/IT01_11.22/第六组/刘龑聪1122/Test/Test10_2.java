package homework;

/*���ߣ�������
 E-mail��15539919713@163.com
 */
public class Test10_2 {
	public static void main(String[] args) {

		System.out.println("�žų˷���");
		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			}
			a++;
			System.out.println();
		}
	}
}
