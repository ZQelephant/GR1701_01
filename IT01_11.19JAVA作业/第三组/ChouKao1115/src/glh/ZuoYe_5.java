package glh;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe_5 {
	public static void main(String[] args) {
		//��1000���ڼ��ܱ�5�������ܱ�3��������������
		int a = 1;
		do{
			if(a%3==0&&0==a%5){
				System.out.println("1000���ڼ��ܱ�5�������ܱ�3����������:"+a);
			}
			a++;
		}
			while(a<=1000);


}
}
