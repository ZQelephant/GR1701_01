package wangshenliang;

/**
 * @author ���� ������E-mail:793708547@QQ.com
 * @date ����ʱ�䣺2017��11��28�� ����7:10:06
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Two {
	public static void main(String[] args) {
		int a[]= {5,9,12,45,18,30};
		int sum=0;
		int Max=a[0];
		int Min=a[0];
		for (int i = 0; i < a.length-1; i++) {
			sum+=a[i];
			if (a[i+1]>Max) {
				Max=a[i+1];
				
			}if (a[i+1]<Min) {
				Min=a[i+1];
				
			}
		}System.out.println(sum);
		System.out.println(Max);
		System.out.println(Min);
	}

}
