package six;
/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��19�� ����8:14:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work {
	public static void main(String[] args) {
		//��дJava�������λ��Ϊ6���ܱ�3��������λ�������ж���
		int a=0;
		for(int b=100;b<1000;b++){
			if(b % 10==6 && b%3==0){
				System.out.println(b+"");
				a++;
			}
		}
		System.out.println("��λ�����У�"+a);
	}

}
