package liuyancong;
/*Author��������
 *E-mail��15539919713@163.com
 */
public class MaxMin {
	public static void main(String[] args) {
		int[] a = {5,9,12,45,18,30};
		
		int sum = 0;
		int max = a[0];
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (a[i]>max) {
				max = a[i];
			}
			if (a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("����������Ԫ��֮��Ϊ��"+sum);
		System.out.println("����Ԫ�������ֵΪ"+max);
		System.out.println("����Ԫ������СֵΪ"+min);
	}
}
