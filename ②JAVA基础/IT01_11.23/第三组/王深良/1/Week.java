import java.util.Scanner;

/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��24�� ����12:59:50 
 * @version 1.0 
 * @parameter  
 * @sinc  
 * @return  
 * @function
 */

public class Week {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		switch ( a) {
		
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
			
		default:
			System.out.println("���������");
			break;
		}
	}

}
