package whh;
/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��11��14�� ����7:04:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Evaluation {
	public static void main(String[] args) {

		int a = 0;
		for(int b = 1;b<=100;b++){
			if(b%10==3){
				continue;
			}
			a+=b;
			
			
		}System.out.println(a);
		
	}

}
