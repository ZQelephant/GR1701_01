package liuyancong;
/*���ߣ�������
  E-mail��15539919713@163.com
 */
public class Sysof5And3 {
	public static void main(String[] args) {
		System.out.println("1000�����ܱ�5��3����������");
		int a = 1;
		int i = 0;
		do {
			if (a % 5 == 0 && a % 3 == 0) {
				System.out.print(a + "\t");
				i++;
				if (i % 6 == 0) {
					System.out.println();
				}
			}
			a++;
		} while (a <= 1000);
	}
}