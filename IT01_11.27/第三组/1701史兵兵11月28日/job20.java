package job;
/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��28�� ����6:58:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class job20 {
	public static void main(String[] args) {
		//����һ����������{5,9,12,45,18,30}��Ҫ���ӡ
		//������������Ԫ��֮�ͣ�����ӡ�����ֵ����Сֵ��
		int []a={5,9,12,45,18,30};
		int sum=0;
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			if (a[i]>max) {
				max=a[i];
				
			}
			if (a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
	}

}
