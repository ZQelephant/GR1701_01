import java.util.Scanner;

/** 
 * @author  ���� ������:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��11��22�� ����9:09:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test10 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("����һ������");
		int a =sc.nextInt();
		if (a>10000) {
			System.out.println("����������");
			
		} else {
			for (int i = 1; i < 10000; i++) {
				if ((i%7==0)&&(i/1000==7||i/100%10==7||i/10%10==7||i%10==7)) {
					System.out.println(i);
					
				}
				
			}

		}
	}

}
