package homework;

/*���ߣ�������
 E-mail��15539919713@163.com
 */
public class Test10_1 {
	public static void main(String[] args) {

		System.out.println("�žų˷���");
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
			}
			System.out.println();
		}
	}
}