package glh;

import java.util.Scanner;

/** 
 * @author  ������
 * @���� E-mail��1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����7:33:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ChouKao_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������һ��������10000��������");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x <= 10000&&x >= 0){
			for(int i = 1;;i++){
				x = x/10;
				if(x <= 0){
					System.out.println("������һ��"+i+"λ����");
					break;
				}
			}
		}else{
			System.out.println("������һ��������10000������");
		}
	}

}
