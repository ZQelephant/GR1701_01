
public class Second {
	
	public static void main(String[] args) {
		
		//2 ����һ����������{5,9,12,45,18,30}��Ҫ���ӡ������������Ԫ��֮�ͣ�����ӡ�����ֵ����Сֵ��
		
		int []a= {5,9,12,45,18,30};
		int sum=0;
		int max=a[0];
		int main=a[0];
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			if (max<a[i]) {
				max=a[i];
			}
			if (main>a[i]) {
				main=a[i];
			}
		}
		System.out.println(sum);
		System.out.println(max);
		System.out.println(main);
		
	}

}
