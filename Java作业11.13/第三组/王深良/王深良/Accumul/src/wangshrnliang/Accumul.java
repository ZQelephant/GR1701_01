package wangshrnliang;
/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��14�� ����7:00:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Accumul {
	public static void main(String[] args) {
		int  a= 0;
		for(int i = 1;i<=100;i++){
			if(i%10==3){
				continue;
			}
			a+=i;
			
			
		}System.out.println(a);
	}

}
