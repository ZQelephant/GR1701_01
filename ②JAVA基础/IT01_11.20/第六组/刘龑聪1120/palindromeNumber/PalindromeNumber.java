package palindromeNumber;

import java.util.Scanner;

/*���ߣ�������
 *E-mail��15539919713@163.com
 */
public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.print("������һ����λ����");
		Scanner sc = new Scanner(System.in);
		int num = sc .nextInt();
		
		if(num/10000==num%10&&num/1000%10==num/10%10){
			System.out.println("����������ǻ�������");
		}else{
			System.out.println("������������ǻ�������");
		}
		sc.close();
	}
}
