package liuyancong;
/*���ߣ�������
  E-mail��15539919713@163.com
 */
public class OddNumber {
	public static void main(String[] args) {
		System.out.println("1000���ڵ�����������");
		int i= 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 2 != 0) {
				i++;
				System.out.print(a+"\t");
				if(i%5==0){
					System.out.println();
				}
			}
		}
	}
}