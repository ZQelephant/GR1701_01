package liuyancong;
/*���ߣ�������
  E-mail��15539919713@163.com
 */
public class SumOf8 {
	public static void main(String[] args) {
		System.out.print("1000��������8�ı���֮��Ϊ��");
		int sum = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 8 == 0) {
				sum += a;
			}
		}
		System.out.print(sum);
	}
}