package GLH;
/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HomeWork1127_2 {

	public static void main(String[] args) {
		
		//����һ����������{5,9,12,45,18,30}��Ҫ���ӡ������������Ԫ��֮�ͣ�����ӡ�����ֵ����Сֵ��
		int []a = {5,9,12,45,18,30};
		int sum = 0;
		
		int max = a[0];
		int min = a[0];
		
		for (int x = 0;x < a.length;x++){
			if (a[x] > max){
				max = a[x];
			}
			if (a[x] < min){
				min = a[x];
		}
		}
		System.out.println(max);
		System.out.println(min);
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
