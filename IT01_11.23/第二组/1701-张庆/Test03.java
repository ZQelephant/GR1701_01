package zhangqing;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
	//��дJAVA����ͨ������̨����һ������N��N������10000����
	//�жϸ������Ǽ�λ��������������
		System.out.println("������һ������������10000������");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i <=10000&&i >=0){
			for (int a=1;;a++){
				i=i/10;
				if(i<=0){
					System.out.println("������һ��"+i+"λ��!");
					break;		
				}
			}
		} else {
			System.out.println("������һ����ȷ������");
		}
	}
}