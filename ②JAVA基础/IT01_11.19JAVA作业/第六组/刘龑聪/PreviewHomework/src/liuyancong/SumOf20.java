package liuyancong;
/*���ߣ�������
  E-mail��15539919713@163.com
 */
public class SumOf20 {
	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			sum += a;
			if (sum > 20) {
				System.out.println("�ۼӵ�"+a+"�������21��");
				break;
			}
		}
	}
}