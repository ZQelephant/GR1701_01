/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��24�� ����1:08:39 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Number {
	public static void main(String[] args) {
		int a=0;
		for (int i = 1; i < 101; i++) {
			if(i%2==0)
				continue;
			else {
				a+=i;
				
			}
			
		}System.out.println(a);
	}

}
